<template>
  <Layout>
    <Content>
      <Breadcrumb>
        <BreadcrumbItem>数据概览</BreadcrumbItem>
      </Breadcrumb>
      <Card>
        <div class="card-container">
          <div class="card-list">
            <Card>
              <div class="card-content">
                <p style="line-height: 42px;">未确认：{{unConfirmedNum || 0}}个</p>
              </div>
            </Card>
          </div>
          <div class="card-list">
            <Card>
              <div class="card-content">
                <p style="line-height: 42px;">已确认：{{confirmedNum || 0}}个</p>
              </div>
            </Card>
          </div>
          <div class="card-list">
            <Card>
              <div class="card-content">
                <p style="line-height: 42px;">已处理：{{handledNum  || 0}}个</p>
              </div>
            </Card>
          </div>
          <div class="card-list">
            <Card>
              <div class="card-content">
                <p style="line-height: 42px;">预警处理平均时长：{{avgHandleTimeNum || 0}}小时</p>
              </div>
            </Card>
          </div>
        </div>
        <Row type="flex" justify="space-between">
          <Col style="width: 70%">
            <Row type="flex" justify="space-between">
              <Col style="width: 48%">
                <chart-card title="个人预警级别情况">
                  <pieChart ref="chart1">
                    <div id="chart1" style="height: 300px;"></div>
                  </pieChart>
                </chart-card>
              </Col>
              <Col style="width: 48%">
                <chart-card title="部门应用预警情况分析">
                  <div style="height: 300px;">
                    <warning-analysis ref="warningAnalysis"></warning-analysis>
                  </div>
                </chart-card>
              </Col>
            </Row>
            <Row type="flex" justify="space-between">
              <Col style="width: 100%">
                <chart-card title="个人预警产生处理情况">
                  <barChart ref="Chart3">
                    <div id="Chart3" style="height: 300px;"></div>
                  </barChart>
                </chart-card>
              </Col>
            </Row>
          </Col>
          <Col style="width: 28%">
            <chart-card title="预警类型TOP10">
              <barChart ref="topTen">
                <div id="topTen" style="height: 600px;"></div>
              </barChart>
            </chart-card>
          </Col>
        </Row>
      </Card>
    </Content>
  </Layout>
</template>

<script>
import {mapState} from 'vuex'
import api from '@/api/axiosApi'
import warnApiList from '@/api/warnApiList'
import superviseApiList from '@/api/superviseApiList'

// echart图外层容器，包括卡片样式
import chartCard from '@/view/home/chartCard.vue'
import lineChart from '@/view/home/lineChart.vue'
import pieChart from '@/view/home/pieChart.vue'

import barChart from '@/view/home/barChart.vue'
import bar3D from '@/view/supervise/echarts/bar3D'
import {horizontalBar, dataPie, simpleBar} from '@/assets/js/echartOption'
export default {
  components:{
    chartCard,
    lineChart,
    barChart,
    pieChart,
    'warningAnalysis': bar3D,
  },
  data() {
    return {
      unConfirmedNum: 0,
      confirmedNum: 0,
      handledNum : 0,
      avgHandleTimeNum: 0,
      topTenOption: horizontalBar(),
      chart1Option: dataPie(),
      chart3Option: simpleBar()
    }
  },
  computed: {
    ...mapState(['userInfo'])
  },
  mounted () {
    this.getHomePageCount()
    this.drawTopTen()
    this.drawChart1()
    this.drawChart3()
    this.fairwarnRelationship('')
  },
  methods: {
    getHomePageCount() {
      const vm = this
      api(warnApiList.getWarnMixStatusNum, {
        userId: vm.userInfo.userId
      }).then(res => {
        if (res.data.errcode === 0) {
          const data = res.data.data
          vm.unConfirmedNum = data.unConfirmedNum
          vm.confirmedNum = data.confirmedNum
          vm.handledNum  = data.handledNum
          vm.avgHandleTimeNum = data.avgHandleTimeNum
        } else {
          vm.$Message.info(res.data.errmsg)
        }
      }, err => {console.log(err)})
    },
    // 绘制运维服务数量分析图表
    drawServiceNum (yearServiceMap) {
      const vm = this
      const opts = {
        el: 'serviceNum',
        xAxis: {
          name: '月份',
          data: yearServiceMap.monthList
        },
        yAxis: {
          name: '次数'
        },
        series: [{
          name: '服务次数',
          type:'line',
          data: yearServiceMap.data
        }]
      }
      vm.$refs.serviceNum.refresh(opts)
    },
    // 绘制个人预警产生处理情况
    drawChart3 () {
      const vm = this

      api(warnApiList.warnHandleStatistical)
      .then(res => {
        if (res.data.errcode === 0) {
          const data = res.data.data
          const name = []
          // 待处理
          const series0 = []
          // 产生
          const series1 = []
          // 已处理
          const series2 = []
          data.map(item => {
            name.push(item.month)
            series0.push(item.pending<=0 ? 0:item.pending)
            series1.push(item.newCome<=0 ? 0:item.newCome)
            series2.push(item.handled<=0 ? 0:item.handled)
          })
          vm.chart3Option.xAxis.data = name
          vm.chart3Option.legend = {
            top: '15px',
            left: '60px',
            right: 'auto',
            data: ['未确认', '已确认', '已处理'],
            textStyle: {
              fontSize: 12,
              color: '#333'
            }
          }
          const series = [{
            name: '未确认',
            type: 'bar',
            data: series0,
            barWidth: 8,
            itemStyle: {
              fontSize: '12'
            }
          }, {
            name: '已确认',
            type: 'bar',
            data: series1,
            barWidth: 8,
            itemStyle: {
              fontSize: '12'
            }
          }, {
            name: '已处理',
            type: 'bar',
            data: series2,
            barWidth: 8,
            itemStyle: {
              fontSize: '12'
            }
          }]
          vm.chart3Option.series = series
          const opts = {
            el: 'Chart3',
            ...vm.chart3Option
          }
          vm.$refs.Chart3.refresh(opts)
        } else {
          vm.$Message.info(res.data.errmsg)
        }
      }, err => {console.log(err)})
    },
    // 预警类型TOP10
    drawTopTen () {
      const vm = this
      api(warnApiList.findWarnType)
      .then(res => {
        if (res.data.errcode === 0) {
          const data = res.data.data
          const name = []
          const count = []
          data.map(item => {
            name.unshift(item.type)
            count.unshift(item.count)
          })
          vm.topTenOption.yAxis.axisLabel = {
            show: true,
            color: '#666'
          }
          vm.topTenOption.color = ['#487EC1', '#48B9C1', '#A27DE2', '#32C0D6']
          vm.topTenOption.xAxis.axisLabel = {
            show: true,
            color: '#666'
          }
          vm.topTenOption.yAxis.axisLabel = {
            color: '#666',
            rotate: 20
          }
          vm.topTenOption.yAxis.data = name
          vm.topTenOption.series[0].data = count
          const opts = {
            el: 'topTen',
            ...vm.topTenOption
          }
          vm.$refs.topTen.refresh(opts)
        } else {
          vm.$Message.info(res.data.errmsg)
        }
      }, err => {console.log(err)})
    },
    // 个人预警级别情况
    drawChart1 () {
      const vm = this
      api(warnApiList.findLevelCount)
      .then(res => {
        if (res.data.errcode === 0) {
          const data = res.data.data
          // const data = [{level: 1, count: 20}, {level: 2, count: 50}]
          const names = ['--', '一般', '较重', '严重', '特别严重']
          vm.chart1Option.el = 'chart1'
          vm.chart1Option.title = {}
          vm.chart1Option.legend.data = ['一般', '较重', '严重', '特别严重']
          vm.chart1Option.series[0].name = '个人预警级别情况'
          vm.chart1Option.series[0].data = []
          data.map(item => {
            vm.chart1Option.series[0].data.push({
              name: names[item.level],
              value: item.count
            })
          })
          vm.$refs.chart1.refresh(vm.chart1Option)
        } else {
          vm.$Message.info(res.data.errmsg)
        }
      }, err => {console.log(err)})
    },
    fairwarnRelationship(id) { // 数博会部门、预警、应用关系
      /*api(superviseApiList.fairwarnRelationship)
      .then((res) => {
        if(res.status == 200 && res.data.data) {
          let data = res.data.data;
          let xAxis3D = [];
          let yAxis3D = [];
          let optionData = [];
          let tempDate = {};
          for(let i in data) {
            xAxis3D.push(data[i].appName);
            yAxis3D.push(data[i].department);
            tempDate[data[i].appName + "--" + data[i].department] = data[i].count;
          };
          xAxis3D = this.toHeavy(xAxis3D);
          yAxis3D = this.toHeavy(yAxis3D);
          for(let i = 0; i < xAxis3D.length; i++) {
            let xAxis = xAxis3D[i]
            for(let j = 0; j < yAxis3D.length; j++) {
              optionData.push([i, j, tempDate[xAxis3D[i] + "--" + yAxis3D[j]]]);
            }
          };
          let echartsData = {
            xAxis3D: xAxis3D,
            yAxis3D: yAxis3D,
            optionData: optionData
          };
          this.$refs.warningAnalysis.refresh(echartsData);
        };
      }, (err) => {
        //dong something...
      })*/
     api(superviseApiList.fairwarnRelationship, {type: 'warn'}).then((res) => {
          if(res.status == 200 && res.data.data) {
            let data = res.data.data;
            if (data) {
              let xzData = []
              let yzLevelOneData = []
              let yzLevelTwoData = []
              let yzLevelThreeData = []
              let yzLevelFourData = []
              let yzTotalNumData = []
              data.map(item => {
                xzData.push(item.department)
                yzTotalNumData.push(item.totalNum)
                item.levelNums.map(res => {
                  switch (res.level){
                    case 1:
                      yzLevelOneData.push(res.count)
                      break
                    case 2:
                      yzLevelTwoData.push(res.count)
                      break
                    case 3:
                      yzLevelThreeData.push(res.count)
                      break
                    case 4:
                      yzLevelFourData.push(res.count)
                      break
                    default:
                      break
                  }
                })
              })
              let echartsData = {
                xzData,
                yzLevelOneData,
                yzLevelTwoData,
                yzLevelThreeData,
                yzLevelFourData,
                yzTotalNumData
              }
              this.$refs.warningAnalysis.refresh(echartsData);
            }
          };
        }, (err) => {
          //dong something...
        })
    },
    toHeavy(list) { //数组去重
      let res = [];
      let json = {};
      for(let i = 0; i < list.length; i++) {
        if(!json[list[i]]) {
          res.push(list[i]);
          json[list[i]] = 1;
        }
      }
      return res;
    }
  }
}
</script>

<style lang="less" scoped>
.card-container{
  &:after{
    content: '';
    clear: both;
    display: block;
  }
  .card-list{
    float: left;
    width: 22%;
    margin-left: 4%;
    text-align: center;
    &:nth-child(1){
      margin-left: 0;
    }
    .card-content{
      display: inline-block;
      text-align: left;
      font-size: 14px;
      height: 42px;
    }
  }
}
</style>

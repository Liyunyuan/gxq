<template>
	<div>
		<table class="tab">
			<tr>
				<th width="150">应用程序名称</th>
				<td><span v-for="item in dataView.dutyList">{{item.app_name}}</span></td>
				<th width="150">预警标题</th>
				<td>{{dataView.warn.title}}</td>
			</tr>
			<tr>
				<th>业务类型</th>
				<td><span v-for="item in dataView.dutyList">{{typeList[item.biz_type]}}</span></td>
				<th>业务责任名称</th>
				<td><span v-for="item in dataView.dutyList">{{item.name_}}</span></td>
			</tr>
			<tr>
				<th>预警类型</th>
				<td>{{dataView.warn.type}}</td>
				<th>预警时间</th>
				<td>{{dataView.warn.warntime}}</td>
			</tr>
			<tr>
				<th>预警状态</th>
				<td>{{dataView.warn.status | statusText}}</td>
				<th>预警内容</th>
				<td>{{dataView.warn.content}}</td>
			</tr>
			<tr>
				<th>预警级别</th>
				<td>{{dataView.warn.level | levelText}}</td>
				<th>预警最近处理时间</th>
				<td>{{dataView.warn.hanTime}}</td>
			</tr>
			<tr>
				<th>预警接收人姓名及类型及接收时间</th>
				<td colspan="3">
					<p v-for="personInfo in dataView.sendeeList">
						{{personInfo.recName}}:{{personInfo.recType | recTypeText}}({{personInfo.recTime}})
					</p>
				</td>
			</tr>
			<tr>
				<th>确认信息</th>
				<td colspan="3">
					<p v-for="personInfo in dataView.sendeeList" v-if="personInfo.recType=='1'">
						{{personInfo.recName}}:{{statusResult(personInfo.status,personInfo.result)}}  {{personInfo.remarks}}
					</p>
				</td>
			</tr>
			<tr>
				<th>处理信息</th>
				<td colspan="3">
					<p v-for="personInfo in dataView.sendeeList" v-if="personInfo.recType=='3'">
						{{personInfo.recName}}:{{statusResult(personInfo.status,personInfo.result)}}  {{personInfo.remarks}}
					</p>
				</td>
			</tr>
		</table>
	</div>
</template>

<script>
	export default {
    props: ['dataView'],
    data () {
      return {
        typeList:{personnel: '人员', department: '部门', company: '单位', application: '应用',}
      }
    },
		filters: {
			statusText(value) {
				var statusText;
				switch(value) {
					case '1':
						statusText = "未确认";
						break;
					case '2':
						statusText = "已确认属实";
						break;
					case '3':
						statusText = "已确认不属实";
						break;
					case '4':
						statusText = "已处理";
						break;
					default:
						statusText = "";
						break;
				};
				return statusText;
			},
			levelText(value) {
				var levelText;
				switch(value) {
					case 1:
						levelText = "一般";
						break;
					case 2:
						levelText = "较重";
						break;
					case 3:
						levelText = "严重";
						break;
					case 4:
						levelText = "特别严重";
						break;
					default:
						levelText = "";
						break;
				};
				return levelText;
			},
			recTypeText(value) {
				var recTypeText;
				switch(value) {
					case '1':
						recTypeText = "确认人";
						break;
					case '2':
						recTypeText = "抄送人";
						break;
					case '3':
						recTypeText = "责任人";
						break;
					default:
						recTypeText = "";
						break;
				};
				return recTypeText;
			}
		},
		
		methods:{
			statusResult(status,result){
				if(status==1){
					return "未确认";
				}else if(status==2){
					if(!result){
						return "确认不属实";
					}else{
						return "确认属实";
					}
				}else if(status==3){
					if(!result){
						return "已处理不属实";
					}else{
						return "已处理属实";
					}
				}
			}
		},
	}
</script>

<style lang="less" type="text/css" scoped>
	.tab {
		width: 100%;
		table-layout: fixed;
		border-collapse: collapse;
		border-spacing: 0;
		th {
			background: #f5f5f5;
			padding: 9px;
			border: 1px solid #ddd;
		}
		td {
			padding: 9px;
			border: 1px solid #ddd;
		}
	}
</style>
<template>
    <Card :bordered="false">
        <p slot="title">服务详情</p>
        <div style="text-align:center">
            <Form :model="detail" :label-width="100" class="clearfix">
                <Row :gutter="40">
                    <Col span="12">
                        <FormItem label="服务类别：">
                            <Input :value="detail.serviceTypeMc" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="12">
                        <FormItem label="服务对象：">
                            <Input :value="detail.serviceObjMc" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="12">
                        <FormItem label="服务分类：">
                            <Input :value="detail.serviceClassMc" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="12">
                        <FormItem label="服务名称：">
                            <Input :value="detail.serviceNameMc" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="12">
                        <FormItem label="服务时间：">
                            <Input :value="detail.startTime ? `${detail.startTime} - ${detail.endTime}` : ''" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="12">
                        <FormItem label="涉及系统：">
                            <Input :value="systemName" type="text" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="24">
                        <FormItem label="服务简介：">
                            <Input :value="detail.serviceInfo" type="textarea" disabled></Input>
                        </FormItem>
                    </Col>
                    <Col span="24">
                        <FormItem label="服务成果：" label-position="left">
                            <Input :value="detail.serviceResult" disabled type="textarea"></Input>
                        </FormItem>
                    </Col>
                </Row>
            </Form>
        </div>
    </Card>
</template>

<script>
import api from '@/api/axiosApi'
import operationApiList from '@/api/operationApiList'
export default {
    data(){
        return{
            systemName: '',
            detail: {}
        }
    },
    methods:{
        getDetail() {
            const vm = this
            api(operationApiList.getServiceDetailById, {
                id: vm.$route.params.id
            })
            .then(res => {
                if (res.data.errcode === 0) {
                    vm.detail = res.data.data
                    vm.$emit('getDetail', vm.detail);
                    const names = []
                    vm.detail.systemName.map(item => {
                        names.push(item.systemName)
                    })
                    vm.systemName = names.join(',')
                }
            }, error => { console.log(error) })
        }
    },
    mounted() {
        this.getDetail()
    }
}
</script>

<style scoped>
.ivu-form-item >>> .ivu-form-item-content{
    height:auto;
}
.ivu-input-wrapper >>> textarea{
    resize: none;
}
</style>

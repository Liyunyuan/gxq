
<template>
  <Layout>
    <Content>
      <Breadcrumb>
        <!-- <BreadcrumbItem>国信优易</BreadcrumbItem> -->
        <BreadcrumbItem>服务器详情</BreadcrumbItem>
        <Button class="backBtn" type="default" @click="goback(-1)">返回</Button>
      </Breadcrumb>
      <serverCreate :disab="disab"></serverCreate>
      <!-- <specificInfo :disab="disab"></specificInfo>
      <hostInfo></hostInfo> -->
      <!-- <approvalOpinions></approvalOpinions> -->
    </Content>
  </Layout>
</template>

<script>
// 新增服务的表单
import serverCreate from './../common/serverCreate'
import specificInfo from './../common/specificInfo'
import hostInfo from './../common/hostInfo'
import approvalOpinions from './../common/approvalOpinions'
export default {
  components: {
    serverCreate,
    specificInfo,
    hostInfo,
    approvalOpinions
  },
  data(){
    return{
      disab:true,
    }
  },
  methods:{
      goback(n){
          this.$router.go(n);
      }
  }
}
</script>
<style scoped>
.backBtn{
    float: right;
}
</style>

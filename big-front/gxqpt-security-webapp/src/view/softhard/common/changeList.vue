<template>
	<Layout>
		<Content>
			<Breadcrumb>
				<BreadcrumbItem>服务器变更申请管理</BreadcrumbItem>
			</Breadcrumb>
			<Card>
				<Form :model="serverData" ref="searchformData" inline :label-width="100">
					<FormItem label="申请账号：">
						<Input v-model="serverData.applyUname "></Input>
					</FormItem>
					<FormItem label="所属网络">
						<Select class="queryItem" clearable v-model="serverData.netScope">
							<Option value="zwww">政务外网</Option>
							<Option value="hlw">互联网</Option>
							<Option value="zw">专网</Option>
						</Select>
					</FormItem>
					<FormItem :label-width="20">
						<Button type="primary" @click="search">查询</Button>
					</FormItem>
					<FormItem class="goback">
						<Button type="default" @click="goback">返回</Button>
					</FormItem>
				</Form>
				<Table :columns="columns" :data="data" :border='true' class="access-list"></Table>
			</Card>
		</Content>
	</Layout>
</template>
<script>
	import api from '@/api/axiosApi'
	import softhardApiList from '@/api/softhardApiList'
	export default {
		data() {
			return {
				serverData: { //查询参数
					applyUname: '',
					netScope: '',
					originId: '',
				},
				columns: [{
					title: '序号',
					type: 'index',
					width: 60,
					align: 'center'
				}, {
					title: '申请账号',
					width: 90,
					key: 'applyUname'
				}, {
					title: '变更前配置',
					key: 'source',
					render: (h, params) => {
						const cpu = h('p', {style: {color:(!!params.row.source.cpuCountColor)?'red':'black'}} ,"CPU："+params.row.source.cpuCount+"核");
						const memory = h('p', {style: {color:(!!params.row.source.memorySizeColor)?'red':'black'}} ,"内存："+params.row.source.memorySize+"G");
						const netwide = h('p', {style: {color:(!!params.row.source.netWideColor)?'red':'black'}} ,"网络带宽："+params.row.source.netWide+"M");
						const system = h('p', {style: {color:(!!params.row.source.systemColor)?'red':'black'}} ,"操作系统："+params.row.source.system);
						const netScope = h('p', {style: {color:(!!params.row.source.netScopeColor)?'red':'black'}} ,"所属网络："+params.row.source.netScope);
						let actArray = [cpu,memory,netwide,system,netScope];
						if(params.row.source.dtos.length>0){
							var dtosArray = params.row.source.dtos;
							for(let i in dtosArray){
								let item = h('p', {style: {color:(!!dtosArray[i].disksColor)?'red':'black'}}, "磁盘"+dtosArray[i].diskName+"大小："+dtosArray[i].diskSize+"G");
								actArray.push(item);
							}
						};
						return h('div', actArray);
					}
				}, {
					title: '变更后配置',
					key: 'target',
					render: (h, params) => {
						const cpu = h('p', {style: {color:(!!params.row.target.cpuCountColor)?'red':'black'}} ,"CPU："+params.row.target.cpuCount+"核");
						const memory = h('p', {style: {color:(!!params.row.target.memorySizeColor)?'red':'black'}} ,"内存："+params.row.target.memorySize+"G");
						const netwide = h('p', {style: {color:(!!params.row.target.netWideColor)?'red':'black'}} ,"网络带宽："+params.row.target.netWide+"M");
						const system = h('p', {style: {color:(!!params.row.target.systemColor)?'red':'black'}} ,"操作系统："+params.row.target.system);
						const netScope = h('p', {style: {color:(!!params.row.target.netScopeColor)?'red':'black'}} ,"所属网络："+params.row.target.netScope);
						let actArray = [cpu,memory,netwide,system,netScope];
						if(params.row.target.dtos.length>0){
							var dtosArray = params.row.target.dtos;
							for(let i in dtosArray){
								let item = h('p', {style: {color:(!!dtosArray[i].disksColor)?'red':'black'}}, "磁盘"+dtosArray[i].diskName+"大小："+dtosArray[i].diskSize+"G");
								actArray.push(item);
							}
						};
						return h('div', actArray);
					}
				}, {
					title: '所属网络',
					key: 'target',
					render: (h, params) => {
						let html="";
						html+=params.row.target.netScope;
						return h('div', html)
					}
				}, {
					title: '申请时间',
					key: 'applyTime',
					width: 150
				}, {
					title: '申请单号',
					key: 'applyNo',
					width: 120
				}],
				data: [], //表格数据
			}
		},
		mounted() {
			this.serverData.originId = this.$route.params.originId;
			this.servermanagerPageChange(); //查询服务分配变更列表
		},
		methods: {
			search() { // 点击查询按钮
				this.servermanagerPageChange();
			},
			goback() { // 返回
				this.$router.go(-1);
			},
			servermanagerPageChange() { // 查询服务分配变更列表
				this.data = [];
				var formData = this.serverData;
				api(softhardApiList.servermanagerPageChange, formData).then((res) => {
					if(res.status == 200 && res.data.data) {
						this.data = res.data.data;
						this.data.forEach((item,index)=>{
							if(item.source.cpuCount != item.target.cpuCount){
								item.source.cpuCountColor = true;
								item.target.cpuCountColor = true;
							}
							if(item.source.memorySize != item.target.memorySize){
								item.source.memorySizeColor = true;
								item.target.memorySizeColor = true;
							}
							if(item.source.netWide != item.target.netWide){
								item.source.netWideColor = true;
								item.target.netWideColor = true;
							}
							if(item.source.system != item.target.system){
								item.source.systemColor = true;
								item.target.systemColor = true;
							}
							if(item.source.netScope != item.target.netScope){
								item.source.netScopeColor = true;
								item.target.netScopeColor = true;
							}
							let sl = item.source.dtos.length,tl = item.target.dtos.length;
							for(let i = 0;i<tl - sl;i++){
								item.target.dtos[sl+i].disksColor = Boolean;
								item.target.dtos[sl+i].disksColor = true;
							}
						})
					}
				}, (err) => {
					//dong something...
				})
			},
		}
	}
</script>
<style lang="less">
	.queryItem {
		width: 200px;
	}
	.goback {
		position: absolute;
		right: 6px;
	}
</style>

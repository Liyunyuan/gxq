<template>
	<div id="examine">
		<Form ref="examineData" :model="examineData" :rules="ruleValidate" :label-width="100">
		    <FormItem label="备注：" prop="remarks">
		    	<Row>
      			<Col span="24">
  						<Input v-model="examineData.remarks" type="textarea" :rows="5" :maxlength="255" ></Input>
  						<sub class="fontColor">内容长度限制255字符内</sub>
  					</Col>
    			</Row>
			</FormItem>
			<Row>
		        <Col span="12">
		        	<FormItem label="审核时间：">
						<DatePicker type="date" v-model="examineTime" readonly disabled> </DatePicker>
					</FormItem>
		        </Col>
		        <Col span="12">
		        	<FormItem label="审核人：">
						<Input v-model="examineUser" class="w168" disabled></Input>
					</FormItem>
		        </Col>
		    </Row>
		</Form>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				examineTime: new Date(),
				examineData:{
				},
				ruleValidate: {
					remarks: [{
						required: true,
						message: '备注不可以为空',
						trigger: 'blur'
					}]
				},
			}
		},
		methods:{
			handleSubmit(name) {
				this.$refs[name].validate((valid) => {
					if(valid) {
						this.$emit('examine',this.examineData); 
					}
				})
			},
		},
		computed:{
			examineUser(){
				return this.$store.state.userInfo.userName;
			}
		}
	}
</script>

<style lang="less" scoped="scoped">
  .fontColor{
    color: #bbb;
  }
</style>
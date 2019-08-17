<template>
    <div>
        <Row :gutter="16">
            <Col :span="10">
                <!-- 搜索框操控组件 -->
                <Card style="margin-bottom: 5px">
                    <div class="search-bar">
                        <Form inline label-position="left" :label-width="60" >
                            <FormItem label="句子ID">
                                <Input type="text" placeholder="" style="width:80px">
                                </Input>
                            </FormItem>
                            <FormItem label="支付方式" >
                                <Select :value="-1">
                                    <Option :value="-1">全部</Option>
                                    <Option :value="1">支付宝</Option>
                                    <Option :value="0">微信</Option>
                                </Select>
                            </FormItem>
                        </Form>
                    </div>            
                </Card>
                <Card>
                    <!-- 工具栏 -->
                    <div>
                        <Row :gutter="16">
                            <Col span="3">
                                <ButtonGroup >
                                    <Button @click="search()">搜索</Button>
                                    <Button @click="refresh()">刷新</Button>
                                </ButtonGroup>
                            </Col>
                            <Col span="2">
                                <Upload action="">
                                    <Button  type="success" icon="ios-cloud-upload-outline">微信</Button>
                                </Upload>
                            </Col>
                            <Col span="2">
                                <Upload action="">
                                    <Button type="primary" icon="ios-cloud-upload-outline">支付宝</Button>
                                </Upload>
                            </Col>
                        </Row>


                    </div>
                    <!-- 表格显示部分 -->
                    <div>
                        <Table border :columns="columns" :data="columns_data">
                            <template slot-scope="{ row,index }" slot="action">
                                <Button type="primary" size="small" style="margin-right: 5px" @click="show(index)">查看</Button>踹</Button>
                                <Button type="error" size="small" @click="remove(index)">删除</Button>
                            </template>
                        </Table>
                        <br>
                    </div>
                    <!-- 分页部分 -->
                    <div>
                        <Page
                            :total="total" 
                            :page-size="pageSize"
                            @on-change="on_change"
                        >
                        </Page>
                    </div>
                </Card>
            </Col>
            <Col :span="14">
                <!-- 日历组件 -->
                <vc-calendar />
            </Col>
        </Row>


    </div>
</template>

<script>
// 安装veCalendar ： npm install ve-calendar --save
import veCalendar from "ve-calendar";
export default {
    components: {
        veCalendar
    },
    data(){
        return{
            selectDateList:[],
            total:11,
            pageSize:10,
            columns_data:[],
            columns: [
                {
                    title: 'ID',
                    key: 'id',
                    width:50
                },
                {
                    title: '句子内容',
                    key: 'content'
                },
                {
                    title: '发布者',
                    key: 'uname'
                },
                {
                    title: '操作',
                    slot: 'action',
                    width: 150,
                    align: 'center'
                }
            ],
        }
    },
    methods: {
        getPage(num){
            
        },
        on_change(nextNum){
            alert("页面发生变动")
        },
        search(){
            alert("search");
        },
        refresh(){
            alert("refresh")
        },
        show (index) {
            this.$Modal.info({
                title: '信息查看',
                content: `Name：${this.data6[index].name}<br>Age：${this.data6[index].age}<br>Address：${this.data6[index].address}`
            })
        },
        remove (index) {
            this.data6.splice(index, 1);
            alert("删除了第"+index)
        },      
    }
}
</script>

<style>
.search-bar{
    height: 30px;
    
}
</style>
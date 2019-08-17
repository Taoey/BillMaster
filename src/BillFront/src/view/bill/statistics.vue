<template>
  <div>
    <card style="margin:0 auto">
        <div id="pay_type_chart" :style="{width: '80%', height: '400px'}"></div>
    </card>
  </div>
</template>

<script>


export default {

  components: {

  },
  data () {
    return {
        
    }
  },
  mounted () {
    this.draw_pay_type_chart()
  },
  methods:{
    // 支付方式对比图
    draw_pay_type_chart(){
        let setChart = this.$echarts.init(document.getElementById('pay_type_chart'),'vintage')
        setChart.setOption({
            title : {
                text: '支付方式对比图',
                subtext: '',
                x:'center'
            },
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['微信','其他','支付宝']
            },
            series : [
                {
                    name: '访问来源',
                    type: 'pie',
                    radius : '40%',
                    center: ['50%', '50%'],
                    data:[
                        {value:335, name:'微信'},
                        {value:310, name:'支付宝'},
                        {value:234, name:'其他'},
                    ],
                    label:{
                        normal: {
                            formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c} {per|{d}%}  ',
                            backgroundColor: '#eee',
                            borderColor: '#aaa',
                            borderWidth: 1,
                            borderRadius: 4,
                            // shadowBlur:3,
                            // shadowOffsetX: 2,
                            // shadowOffsetY: 2,
                            // shadowColor: '#999',
                            // padding: [0, 7],
                            rich: {
                                a: {
                                    color: '#999',
                                    lineHeight: 22,
                                    align: 'center'
                                },
                                // abg: {
                                //     backgroundColor: '#333',
                                //     width: '100%',
                                //     align: 'right',
                                //     height: 22,
                                //     borderRadius: [4, 4, 0, 0]
                                // },
                                hr: {
                                    borderColor: '#aaa',
                                    width: '20%',
                                    borderWidth: 0.5,
                                    height: 0
                                },
                                b: {
                                    fontSize: 16,
                                    lineHeight: 33
                                },
                                per: {
                                    color: '#eee',
                                    backgroundColor: '#334455',
                                    padding: [2, 4],
                                    borderRadius: 2
                                }
                            }
                        }
                    },
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        })
    },

  }
}
</script>

<style lang="less">
.count-style{
  font-size: 50px;
}
</style>

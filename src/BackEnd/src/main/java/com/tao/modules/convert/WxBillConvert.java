package com.tao.modules.convert;

import org.springframework.stereotype.Service;

@Service
public class WxBillConvert {
    //账单类型：0-其他 1-转入零钱通-来自零钱 2-转账 3-微信红包 4-扫二维码付款 5-商户消费 6转账-退款 7-微信红包-退款
    public Short billType(String billString){
        Short billType = null;
        if(billString!=null){
            switch (billString){
                case "转入零钱通-来自零钱":billType=1;break;
                case "转账":billType=2;break;
                case "微信红包":billType=3;break;
                case "扫二维码付款":billType=4;break;
                case "商户消费" :billType=5;break;
                case "转账-退款" :billType=6;break;
                case "微信红包-退款" :billType=7;break;
                case "群收款":billType=8;break;
                case "二维码收款":billType=9;break;
                default: billType=0;
            }
        }
        return billType;
    }

    /**
     * 收入类型转换
     * @param str
     * @return
     */
    public Short incomeType(String str){
        Short incomeType = null;
        if(str.equals("收入")){
            incomeType =1;
        }else if(str.equals("支出")){
            incomeType=-1;
        }else{
            incomeType = 0;
        }
        return incomeType;
    }

    /**
     * 收入数据转换
     * @param str ¥4.00
     * @return
     */
    public Long payNum(String str){
        return Long.valueOf(str.trim().substring(1).replace(".",""));
    }
}

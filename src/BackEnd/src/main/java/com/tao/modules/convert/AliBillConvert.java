package com.tao.modules.convert;

import org.springframework.stereotype.Service;

@Service
public class AliBillConvert {
    public Short billType(String str){
        Short billtype = 0;
        switch (str){
            case "即时到账交易": billtype = 1;break;
            case "支付宝担保交易": billtype=2;break;
        }
        return billtype;
    }

    public Long payNum(String str){
        return Long.valueOf(str.trim().replace(".",""));
    }

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

    public Short payStatus(String str){
        Short payStatus = null;
        switch (str.trim()){
            case "交易成功": payStatus=1;break;
            case "等待确认收货":payStatus=2;break;
            case "转出成功" :payStatus=3;break;
            case  "已收齐" : payStatus=4;break;
            default: payStatus=0;
        }
        return payStatus;
    }
}

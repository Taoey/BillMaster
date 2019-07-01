package com.tao.modules.convert;

import com.tao.data.generator.pojo.WxBill;
import com.tao.modules.common.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertFactory {
    @Autowired
    private WxBillConvert wxBillConvert;

    public WxBill toWxBill(String str){
        WxBill wxBill = new WxBill();
        String[] strList = str.split(",");
        wxBill.setGmtCreate(System.currentTimeMillis()/1000);
        wxBill.setGmtModified(System.currentTimeMillis()/1000);
        wxBill.setStatus(Short.parseShort("1"));
        wxBill.setPayTime(DateTimeUtils.dateTime2Timestamp(strList[0],"yyyy-MM-dd HH:mm:ss"));
        wxBill.setBillType(wxBillConvert.billType(strList[1]));
        wxBill.setTrader(strList[2].replaceAll("[\"]",""));
        wxBill.setGoods(strList[3].replaceAll("[\"]",""));
        wxBill.setIncomeType(wxBillConvert.incomeType(strList[4]));
        wxBill.setPayNum(wxBillConvert.payNum(strList[5]));
        wxBill.setPayType(strList[6]);
        wxBill.setPayStatus(strList[7]);
        wxBill.setTradeNum(strList[8]);

        return wxBill;
    }
}

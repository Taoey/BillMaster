package com.tao.modules.convert;

import com.tao.data.generator.pojo.BillDetailAli;
import com.tao.data.generator.pojo.BillDetailWx;
import com.tao.modules.common.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertFactory {
    @Autowired
    private WxBillConvert wxBillConvert;
    @Autowired
    private AliBillConvert aliBillConvert;

    /**
     * 字符串转化为微信账单bean
     * @param str
     * @return
     */
    public BillDetailWx toWxBill(String str){
        BillDetailWx wxBill = new BillDetailWx();
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

    /**
     * 字符串转化为支付宝账单bean
     * @param str
     * @return
     */
    public BillDetailAli toAliBill(String str){
        BillDetailAli aliBill = new BillDetailAli();
        String[] strList = str.split(",");

        aliBill.setGmtCreate(System.currentTimeMillis()/1000);
        aliBill.setGmtModified(System.currentTimeMillis()/1000);
        aliBill.setStatus(Short.parseShort("1"));

        aliBill.setTradeNum(strList[0]);
        aliBill.setPayCreatTime(DateTimeUtils.dateTime2Timestamp(strList[2],"yyyy-MM-dd HH:mm:ss"));
        aliBill.setPayTime(DateTimeUtils.dateTime2Timestamp(strList[3],"yyyy-MM-dd HH:mm:ss"));
        aliBill.setPayModifiedTime(DateTimeUtils.dateTime2Timestamp(strList[4],"yyyy-MM-dd HH:mm:ss"));
        aliBill.setBillPlace(strList[5]);
        aliBill.setBillType(aliBillConvert.billType(strList[6]));
        aliBill.setTrader(strList[7]);
        aliBill.setGoods(strList[8]);
        aliBill.setPayNum(aliBillConvert.payNum(strList[9]));
        aliBill.setIncomeType(aliBillConvert.incomeType(strList[10]));
        aliBill.setPayStatus(aliBillConvert.payStatus(strList[11]));
        aliBill.setPayService(aliBillConvert.payNum(strList[12]));
        aliBill.setPayReturn(aliBillConvert.payNum(strList[13]));
        aliBill.setRemark(strList[14]);
        return  aliBill;
    }
}

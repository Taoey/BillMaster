package com.tao.modules.billdetail.service;

import com.tao.data.generator.dao.WxBillMapper;
import com.tao.data.generator.pojo.WxBill;
import com.tao.data.generator.pojo.WxBillExample;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxBillService {
    @Autowired
    private WxBillMapper wxBillMapper;

    public boolean exist(SimpleMap params){
        WxBill bill = (WxBill)params.toBean(WxBill.class);

        WxBillExample wxBillExample = new WxBillExample();
        wxBillExample.createCriteria()
                .andTradeNumEqualTo(bill.getTradeNum());
        long count = wxBillMapper.countByExample(wxBillExample);
        return count>0;
    }

    public void save(SimpleMap params){
        WxBill bill = (WxBill)params.toBean(WxBill.class);
        wxBillMapper.insertSelective(bill);
    }
    public void save(WxBill bill){
        wxBillMapper.insert(bill);
    }
}

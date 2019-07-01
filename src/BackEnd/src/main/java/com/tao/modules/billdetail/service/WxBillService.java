package com.tao.modules.billdetail.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tao.data.generator.dao.BillDetailWxMapper;
import com.tao.data.generator.pojo.BillDetailWx;
import com.tao.data.generator.pojo.BillDetailWxExample;
import com.tao.data.me.WxBillMapperMe;
import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxBillService {
    @Autowired
    private BillDetailWxMapper billDetailWxMapper;
    @Autowired
    private WxBillMapperMe wxBillMapperMe;

    /**
     * 判断一条微信账单是否存在
     * @param params
     * @return
     */
    public boolean exist(SimpleMap params){
        BillDetailWx bill = (BillDetailWx)params.toBean(BillDetailWx.class);

        BillDetailWxExample billDetailWxExample = new BillDetailWxExample();
        billDetailWxExample.createCriteria()
                .andTradeNumEqualTo(bill.getTradeNum());
        long count = billDetailWxMapper.countByExample(billDetailWxExample);
        return count>0;
    }

    /**
     * 保存一条记录
     * @param params
     */
    public void save(SimpleMap params){
        BillDetailWx bill = (BillDetailWx)params.toBean(BillDetailWx.class);
        billDetailWxMapper.insertSelective(bill);
    }
    public void save(BillDetailWx bill){
        billDetailWxMapper.insert(bill);
    }

    /**
     * 分页查询
     * @param params
     * @return
     */
    public GridPage<SimpleMap> list(SimpleMap params){
        GridPage<SimpleMap> result = new GridPage<>();
        Page<Object> page = PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<SimpleMap> rows = wxBillMapperMe.list(params);
        result.setRows(rows);
        result.setTotal(page.getTotal());
        return result;
    }
}

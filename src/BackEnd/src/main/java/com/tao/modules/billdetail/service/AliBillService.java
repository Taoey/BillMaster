package com.tao.modules.billdetail.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tao.data.generator.dao.BillDetailAliMapper;
import com.tao.data.me.AliBillMapperMe;
import com.tao.modules.common.service.CommonService;
import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliBillService implements CommonService {

    @Autowired
    private BillDetailAliMapper billDetailAliMapper;
    @Autowired
    private AliBillMapperMe aliBillMapperMe;
    /**
     *
     * @param map 交易号
     * @return
     */
    @Override
    public boolean exist(SimpleMap map){

        return false;
    }

    @Override
    public GridPage list(SimpleMap map) {
        GridPage result = new GridPage();
        Page<Object> page = PageHelper.startPage(map.getPageNum(), map.getPageSize());
        aliBillMapperMe.list(map);
        result.setRows(page.getResult());
        result.setTotal(page.getTotal());
        return result;
    }

    /**
     *
     * @param map id-自增ID/tradeNum-交易号  （id优先）
     * @return
     */
    @Override
    public SimpleMap getOne(SimpleMap map) {
        return aliBillMapperMe.getOne(map);
    }

    @Override
    public void saveData(SimpleMap map) {

    }

    @Override
    public void updateDate(SimpleMap map) {

    }
}

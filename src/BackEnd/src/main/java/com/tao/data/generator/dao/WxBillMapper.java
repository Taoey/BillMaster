package com.tao.data.generator.dao;

import com.tao.data.generator.pojo.WxBill;
import com.tao.data.generator.pojo.WxBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxBillMapper {
    long countByExample(WxBillExample example);

    int deleteByExample(WxBillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WxBill record);

    int insertSelective(WxBill record);

    List<WxBill> selectByExample(WxBillExample example);

    WxBill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxBill record, @Param("example") WxBillExample example);

    int updateByExample(@Param("record") WxBill record, @Param("example") WxBillExample example);

    int updateByPrimaryKeySelective(WxBill record);

    int updateByPrimaryKey(WxBill record);
}
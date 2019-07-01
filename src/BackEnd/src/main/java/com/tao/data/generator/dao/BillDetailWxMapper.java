package com.tao.data.generator.dao;

import com.tao.data.generator.pojo.BillDetailWx;
import com.tao.data.generator.pojo.BillDetailWxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillDetailWxMapper {
    long countByExample(BillDetailWxExample example);

    int deleteByExample(BillDetailWxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDetailWx record);

    int insertSelective(BillDetailWx record);

    List<BillDetailWx> selectByExample(BillDetailWxExample example);

    BillDetailWx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillDetailWx record, @Param("example") BillDetailWxExample example);

    int updateByExample(@Param("record") BillDetailWx record, @Param("example") BillDetailWxExample example);

    int updateByPrimaryKeySelective(BillDetailWx record);

    int updateByPrimaryKey(BillDetailWx record);
}
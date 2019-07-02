package com.tao.data.generator.dao;

import com.tao.data.generator.pojo.BillDetailAli;
import com.tao.data.generator.pojo.BillDetailAliExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillDetailAliMapper {
    long countByExample(BillDetailAliExample example);

    int deleteByExample(BillDetailAliExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDetailAli record);

    int insertSelective(BillDetailAli record);

    List<BillDetailAli> selectByExample(BillDetailAliExample example);

    BillDetailAli selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillDetailAli record, @Param("example") BillDetailAliExample example);

    int updateByExample(@Param("record") BillDetailAli record, @Param("example") BillDetailAliExample example);

    int updateByPrimaryKeySelective(BillDetailAli record);

    int updateByPrimaryKey(BillDetailAli record);
}
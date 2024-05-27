package com.reisen.mapper.auto;

import com.reisen.model.auto.TSysDictType;
import com.reisen.model.auto.TSysDictTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典类型表
 * 
 * @author 一休
 * @email 438081243@qq.com
 * @date 2024-09-05 12:34:25
 */
public interface TSysDictTypeMapper {
    long countByExample(TSysDictTypeExample example);

    int deleteByExample(TSysDictTypeExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(TSysDictType record);

    int insertSelective(TSysDictType record);

    List<TSysDictType> selectByExample(TSysDictTypeExample example);
		
    TSysDictType selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") TSysDictType record, @Param("example") TSysDictTypeExample example);

    int updateByExample(@Param("record") TSysDictType record, @Param("example") TSysDictTypeExample example); 
		
    int updateByPrimaryKeySelective(TSysDictType record);

    int updateByPrimaryKey(TSysDictType record);
}
package com.reisen.mapper.auto;

import com.reisen.model.auto.TSysDictData;
import com.reisen.model.auto.TSysDictDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典数据表
 * 
 * @author 一休
 * @email 438081243@qq.com
 * @date 2024-09-08 00:10:43
 */
public interface TSysDictDataMapper {
    long countByExample(TSysDictDataExample example);

    int deleteByExample(TSysDictDataExample example);
		
    int insert(TSysDictData record);

    int insertSelective(TSysDictData record);

    List<TSysDictData> selectByExample(TSysDictDataExample example);
		
    int updateByExampleSelective(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    int updateByExample(@Param("record") TSysDictData record, @Param("example") TSysDictDataExample example);

    TSysDictData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TSysDictData record);
}
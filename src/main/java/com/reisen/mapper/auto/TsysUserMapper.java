package com.reisen.mapper.auto;

import com.reisen.model.auto.TsysUser;
import com.reisen.model.auto.TsysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TsysUserMapper {
    long countByExample(TsysUserExample example);

    int deleteByExample(TsysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TsysUser record);

    int insertSelective(TsysUser record);

    List<TsysUser> selectByExample(TsysUserExample example);

    TsysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TsysUser record, @Param("example") TsysUserExample example);

    int updateByExample(@Param("record") TsysUser record, @Param("example") TsysUserExample example);

    int updateByPrimaryKeySelective(TsysUser record);

    int updateByPrimaryKey(TsysUser record);
}
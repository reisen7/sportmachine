package com.reisen.mapper.auto;

import com.reisen.model.auto.Tbmaintenacerecord;
import com.reisen.model.auto.TbmaintenacerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 器材维护 TbmaintenacerecordMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-26 23:52:58
 */
public interface TbmaintenacerecordMapper {

    long countByExample(TbmaintenacerecordExample example);

    int deleteByExample(TbmaintenacerecordExample example);
	
    int deleteByPrimaryKey(Integer id);
	
    int insert(Tbmaintenacerecord record);

    int insertSelective(Tbmaintenacerecord record);

    List<Tbmaintenacerecord> selectByExample(TbmaintenacerecordExample example);
	
    Tbmaintenacerecord selectByPrimaryKey(Integer id);
	
    int updateByExampleSelective(@Param("record") Tbmaintenacerecord record, @Param("example") TbmaintenacerecordExample example);

    int updateByExample(@Param("record") Tbmaintenacerecord record, @Param("example") TbmaintenacerecordExample example); 
	
    int updateByPrimaryKeySelective(Tbmaintenacerecord record);

    int updateByPrimaryKey(Tbmaintenacerecord record);
  	
}
package com.reisen.mapper.auto;

import com.reisen.model.auto.Tbreportrecord;
import com.reisen.model.auto.TbreportrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 器材报修 TbreportrecordMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-05-31 02:40:35
 */
public interface TbreportrecordMapper {

    long countByExample(TbreportrecordExample example);

    int deleteByExample(TbreportrecordExample example);
	
    int deleteByPrimaryKey(Integer id);
	
    int insert(Tbreportrecord record);

    int insertSelective(Tbreportrecord record);

    List<Tbreportrecord> selectByExample(TbreportrecordExample example);
	
    Tbreportrecord selectByPrimaryKey(Integer id);
	
    int updateByExampleSelective(@Param("record") Tbreportrecord record, @Param("example") TbreportrecordExample example);

    int updateByExample(@Param("record") Tbreportrecord record, @Param("example") TbreportrecordExample example); 
	
    int updateByPrimaryKeySelective(Tbreportrecord record);

    int updateByPrimaryKey(Tbreportrecord record);
  	
}
package com.reisen.mapper.auto;

import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.auto.TiyuqicaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 体育器材 TiyuqicaiMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:01:05
 */
public interface TiyuqicaiMapper {

    long countByExample(TiyuqicaiExample example);

    int deleteByExample(TiyuqicaiExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Tiyuqicai record);

    int insertSelective(Tiyuqicai record);

    List<Tiyuqicai> selectByExample(TiyuqicaiExample example);
	
    Tiyuqicai selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Tiyuqicai record, @Param("example") TiyuqicaiExample example);

    int updateByExample(@Param("record") Tiyuqicai record, @Param("example") TiyuqicaiExample example); 
	
    int updateByPrimaryKeySelective(Tiyuqicai record);

    int updateByPrimaryKey(Tiyuqicai record);
  	
}
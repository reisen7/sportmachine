package com.reisen.mapper.auto;

import com.reisen.model.auto.Discusstiyuqicai;
import com.reisen.model.auto.DiscusstiyuqicaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 体育器材评论表 DiscusstiyuqicaiMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:21
 */
public interface DiscusstiyuqicaiMapper {

    long countByExample(DiscusstiyuqicaiExample example);

    int deleteByExample(DiscusstiyuqicaiExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Discusstiyuqicai record);

    int insertSelective(Discusstiyuqicai record);

    List<Discusstiyuqicai> selectByExample(DiscusstiyuqicaiExample example);
	
    Discusstiyuqicai selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Discusstiyuqicai record, @Param("example") DiscusstiyuqicaiExample example);

    int updateByExample(@Param("record") Discusstiyuqicai record, @Param("example") DiscusstiyuqicaiExample example); 
	
    int updateByPrimaryKeySelective(Discusstiyuqicai record);

    int updateByPrimaryKey(Discusstiyuqicai record);
  	
}
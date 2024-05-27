package com.reisen.mapper.auto;

import com.reisen.model.auto.News;
import com.reisen.model.auto.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 体育资讯 NewsMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:08:55
 */
public interface NewsMapper {

    long countByExample(NewsExample example);

    int deleteByExample(NewsExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);
	
    News selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example); 
	
    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
  	
}
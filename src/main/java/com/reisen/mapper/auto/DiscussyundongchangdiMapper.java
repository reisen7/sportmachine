package com.reisen.mapper.auto;

import com.reisen.model.auto.Discussyundongchangdi;
import com.reisen.model.auto.DiscussyundongchangdiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 运动场地评论表 DiscussyundongchangdiMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:01
 */
public interface DiscussyundongchangdiMapper {

    long countByExample(DiscussyundongchangdiExample example);

    int deleteByExample(DiscussyundongchangdiExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Discussyundongchangdi record);

    int insertSelective(Discussyundongchangdi record);

    List<Discussyundongchangdi> selectByExample(DiscussyundongchangdiExample example);
	
    Discussyundongchangdi selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Discussyundongchangdi record, @Param("example") DiscussyundongchangdiExample example);

    int updateByExample(@Param("record") Discussyundongchangdi record, @Param("example") DiscussyundongchangdiExample example); 
	
    int updateByPrimaryKeySelective(Discussyundongchangdi record);

    int updateByPrimaryKey(Discussyundongchangdi record);
  	
}
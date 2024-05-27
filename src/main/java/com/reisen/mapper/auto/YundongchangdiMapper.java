package com.reisen.mapper.auto;

import com.reisen.model.auto.Yundongchangdi;
import com.reisen.model.auto.YundongchangdiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 运动场地 YundongchangdiMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 17:53:56
 */
public interface YundongchangdiMapper {

    long countByExample(YundongchangdiExample example);

    int deleteByExample(YundongchangdiExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Yundongchangdi record);

    int insertSelective(Yundongchangdi record);

    List<Yundongchangdi> selectByExample(YundongchangdiExample example);
	
    Yundongchangdi selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Yundongchangdi record, @Param("example") YundongchangdiExample example);

    int updateByExample(@Param("record") Yundongchangdi record, @Param("example") YundongchangdiExample example); 
	
    int updateByPrimaryKeySelective(Yundongchangdi record);

    int updateByPrimaryKey(Yundongchangdi record);
  	
}
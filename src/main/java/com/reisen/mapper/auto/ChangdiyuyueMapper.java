package com.reisen.mapper.auto;

import com.reisen.model.auto.Changdiyuyue;
import com.reisen.model.auto.ChangdiyuyueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 场地预约 ChangdiyuyueMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:12:00
 */
public interface ChangdiyuyueMapper {

    long countByExample(ChangdiyuyueExample example);

    int deleteByExample(ChangdiyuyueExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Changdiyuyue record);

    int insertSelective(Changdiyuyue record);

    List<Changdiyuyue> selectByExample(ChangdiyuyueExample example);
	
    Changdiyuyue selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Changdiyuyue record, @Param("example") ChangdiyuyueExample example);

    int updateByExample(@Param("record") Changdiyuyue record, @Param("example") ChangdiyuyueExample example); 
	
    int updateByPrimaryKeySelective(Changdiyuyue record);

    int updateByPrimaryKey(Changdiyuyue record);
  	
}
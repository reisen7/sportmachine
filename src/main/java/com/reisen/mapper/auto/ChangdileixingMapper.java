package com.reisen.mapper.auto;

import com.reisen.model.auto.Changdileixing;
import com.reisen.model.auto.ChangdileixingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 场地类型 ChangdileixingMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:38
 */
public interface ChangdileixingMapper {

    long countByExample(ChangdileixingExample example);

    int deleteByExample(ChangdileixingExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Changdileixing record);

    int insertSelective(Changdileixing record);

    List<Changdileixing> selectByExample(ChangdileixingExample example);
	
    Changdileixing selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Changdileixing record, @Param("example") ChangdileixingExample example);

    int updateByExample(@Param("record") Changdileixing record, @Param("example") ChangdileixingExample example); 
	
    int updateByPrimaryKeySelective(Changdileixing record);

    int updateByPrimaryKey(Changdileixing record);
  	
}
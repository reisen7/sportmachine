package com.reisen.mapper.auto;

import com.reisen.model.auto.Qicaijieyong;
import com.reisen.model.auto.QicaijieyongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 器材借用 QicaijieyongMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:05:41
 */
public interface QicaijieyongMapper {

    long countByExample(QicaijieyongExample example);

    int deleteByExample(QicaijieyongExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Qicaijieyong record);

    int insertSelective(Qicaijieyong record);

    List<Qicaijieyong> selectByExample(QicaijieyongExample example);
	
    Qicaijieyong selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Qicaijieyong record, @Param("example") QicaijieyongExample example);

    int updateByExample(@Param("record") Qicaijieyong record, @Param("example") QicaijieyongExample example); 
	
    int updateByPrimaryKeySelective(Qicaijieyong record);

    int updateByPrimaryKey(Qicaijieyong record);
  	
}
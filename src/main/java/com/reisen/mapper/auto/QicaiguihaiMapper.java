package com.reisen.mapper.auto;

import com.reisen.model.auto.Qicaiguihai;
import com.reisen.model.auto.QicaiguihaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 器材归还 QicaiguihaiMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:06:09
 */
public interface QicaiguihaiMapper {

    long countByExample(QicaiguihaiExample example);

    int deleteByExample(QicaiguihaiExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Qicaiguihai record);

    int insertSelective(Qicaiguihai record);

    List<Qicaiguihai> selectByExample(QicaiguihaiExample example);
	
    Qicaiguihai selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Qicaiguihai record, @Param("example") QicaiguihaiExample example);

    int updateByExample(@Param("record") Qicaiguihai record, @Param("example") QicaiguihaiExample example); 
	
    int updateByPrimaryKeySelective(Qicaiguihai record);

    int updateByPrimaryKey(Qicaiguihai record);
  	
}
package com.reisen.mapper.auto;

import com.reisen.model.auto.Quxiaoyuyue;
import com.reisen.model.auto.QuxiaoyuyueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 取消预约 QuxiaoyuyueMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:18:51
 */
public interface QuxiaoyuyueMapper {

    long countByExample(QuxiaoyuyueExample example);

    int deleteByExample(QuxiaoyuyueExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Quxiaoyuyue record);

    int insertSelective(Quxiaoyuyue record);

    List<Quxiaoyuyue> selectByExample(QuxiaoyuyueExample example);
	
    Quxiaoyuyue selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Quxiaoyuyue record, @Param("example") QuxiaoyuyueExample example);

    int updateByExample(@Param("record") Quxiaoyuyue record, @Param("example") QuxiaoyuyueExample example); 
	
    int updateByPrimaryKeySelective(Quxiaoyuyue record);

    int updateByPrimaryKey(Quxiaoyuyue record);
  	
}
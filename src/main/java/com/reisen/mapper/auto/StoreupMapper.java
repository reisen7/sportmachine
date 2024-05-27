package com.reisen.mapper.auto;

import com.reisen.model.auto.Storeup;
import com.reisen.model.auto.StoreupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 收藏表 StoreupMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:03:42
 */
public interface StoreupMapper {

    long countByExample(StoreupExample example);

    int deleteByExample(StoreupExample example);
	
    int deleteByPrimaryKey(Long id);
	
    int insert(Storeup record);

    int insertSelective(Storeup record);

    List<Storeup> selectByExample(StoreupExample example);
	
    Storeup selectByPrimaryKey(Long id);
	
    int updateByExampleSelective(@Param("record") Storeup record, @Param("example") StoreupExample example);

    int updateByExample(@Param("record") Storeup record, @Param("example") StoreupExample example); 
	
    int updateByPrimaryKeySelective(Storeup record);

    int updateByPrimaryKey(Storeup record);
  	
}
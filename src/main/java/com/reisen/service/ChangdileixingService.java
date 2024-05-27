package com.reisen.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.reisen.common.base.BaseService;
import com.reisen.common.support.ConvertUtil;
import com.reisen.mapper.auto.ChangdileixingMapper;
import com.reisen.model.auto.Changdileixing;
import com.reisen.model.auto.ChangdileixingExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 场地类型 ChangdileixingService
 * @Title: ChangdileixingService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:38  
 **/
@Service
public class ChangdileixingService implements BaseService<Changdileixing, ChangdileixingExample>{
	@Autowired
	private ChangdileixingMapper changdileixingMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Changdileixing> list(Tablepar tablepar,Changdileixing changdileixing){
	        ChangdileixingExample testExample=new ChangdileixingExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(changdileixing);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Changdileixing> list= changdileixingMapper.selectByExample(testExample);
	        PageInfo<Changdileixing> pageInfo = new PageInfo<Changdileixing>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ChangdileixingExample example=new ChangdileixingExample();
			example.createCriteria().andIdIn(stringB);
			return changdileixingMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Changdileixing selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return changdileixingMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Changdileixing record) {
		return changdileixingMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Changdileixing record) {
		
		record.setId(null);
		
		
		return changdileixingMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Changdileixing record, ChangdileixingExample example) {
		
		return changdileixingMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Changdileixing record, ChangdileixingExample example) {
		
		return changdileixingMapper.updateByExample(record, example);
	}

	@Override
	public List<Changdileixing> selectByExample(ChangdileixingExample example) {
		
		return changdileixingMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ChangdileixingExample example) {
		
		return changdileixingMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ChangdileixingExample example) {
		
		return changdileixingMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param changdileixing
	 * @return
	 */
	public int updateVisible(Changdileixing changdileixing) {
		return changdileixingMapper.updateByPrimaryKeySelective(changdileixing);
	}


}

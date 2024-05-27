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
import com.reisen.mapper.auto.ChangdiyuyueMapper;
import com.reisen.model.auto.Changdiyuyue;
import com.reisen.model.auto.ChangdiyuyueExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 场地预约 ChangdiyuyueService
 * @Title: ChangdiyuyueService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:12:00  
 **/
@Service
public class ChangdiyuyueService implements BaseService<Changdiyuyue, ChangdiyuyueExample>{
	@Autowired
	private ChangdiyuyueMapper changdiyuyueMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Changdiyuyue> list(Tablepar tablepar,Changdiyuyue changdiyuyue){
	        ChangdiyuyueExample testExample=new ChangdiyuyueExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(changdiyuyue);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Changdiyuyue> list= changdiyuyueMapper.selectByExample(testExample);
	        PageInfo<Changdiyuyue> pageInfo = new PageInfo<Changdiyuyue>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ChangdiyuyueExample example=new ChangdiyuyueExample();
			example.createCriteria().andIdIn(stringB);
			return changdiyuyueMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Changdiyuyue selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return changdiyuyueMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Changdiyuyue record) {
		return changdiyuyueMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Changdiyuyue record) {
		
		record.setId(null);
		
		
		return changdiyuyueMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Changdiyuyue record, ChangdiyuyueExample example) {
		
		return changdiyuyueMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Changdiyuyue record, ChangdiyuyueExample example) {
		
		return changdiyuyueMapper.updateByExample(record, example);
	}

	@Override
	public List<Changdiyuyue> selectByExample(ChangdiyuyueExample example) {
		
		return changdiyuyueMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ChangdiyuyueExample example) {
		
		return changdiyuyueMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ChangdiyuyueExample example) {
		
		return changdiyuyueMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param changdiyuyue
	 * @return
	 */
	public int updateVisible(Changdiyuyue changdiyuyue) {
		return changdiyuyueMapper.updateByPrimaryKeySelective(changdiyuyue);
	}


}

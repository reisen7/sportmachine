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
import com.reisen.mapper.auto.StoreupMapper;
import com.reisen.model.auto.Storeup;
import com.reisen.model.auto.StoreupExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 收藏表 StoreupService
 * @Title: StoreupService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:03:42  
 **/
@Service
public class StoreupService implements BaseService<Storeup, StoreupExample>{
	@Autowired
	private StoreupMapper storeupMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Storeup> list(Tablepar tablepar,Storeup storeup){
	        StoreupExample testExample=new StoreupExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(storeup);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Storeup> list= storeupMapper.selectByExample(testExample);
	        PageInfo<Storeup> pageInfo = new PageInfo<Storeup>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			StoreupExample example=new StoreupExample();
			example.createCriteria().andIdIn(stringB);
			return storeupMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Storeup selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return storeupMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Storeup record) {
		return storeupMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Storeup record) {
		
		record.setId(null);
		
		
		return storeupMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Storeup record, StoreupExample example) {
		
		return storeupMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Storeup record, StoreupExample example) {
		
		return storeupMapper.updateByExample(record, example);
	}

	@Override
	public List<Storeup> selectByExample(StoreupExample example) {
		
		return storeupMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(StoreupExample example) {
		
		return storeupMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(StoreupExample example) {
		
		return storeupMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param storeup
	 * @return
	 */
	public int updateVisible(Storeup storeup) {
		return storeupMapper.updateByPrimaryKeySelective(storeup);
	}


}

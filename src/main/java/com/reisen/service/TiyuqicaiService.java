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
import com.reisen.mapper.auto.TiyuqicaiMapper;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.auto.TiyuqicaiExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 体育器材 TiyuqicaiService
 * @Title: TiyuqicaiService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:01:05  
 **/
@Service
public class TiyuqicaiService implements BaseService<Tiyuqicai, TiyuqicaiExample>{
	@Autowired
	private TiyuqicaiMapper tiyuqicaiMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Tiyuqicai> list(Tablepar tablepar,Tiyuqicai tiyuqicai){
	        TiyuqicaiExample testExample=new TiyuqicaiExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tiyuqicai);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Tiyuqicai> list= tiyuqicaiMapper.selectByExample(testExample);
	        PageInfo<Tiyuqicai> pageInfo = new PageInfo<Tiyuqicai>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			TiyuqicaiExample example=new TiyuqicaiExample();
			example.createCriteria().andIdIn(stringB);
			return tiyuqicaiMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Tiyuqicai selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return tiyuqicaiMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Tiyuqicai record) {
		return tiyuqicaiMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Tiyuqicai record) {
		
		record.setId(null);
		
		
		return tiyuqicaiMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Tiyuqicai record, TiyuqicaiExample example) {
		
		return tiyuqicaiMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Tiyuqicai record, TiyuqicaiExample example) {
		
		return tiyuqicaiMapper.updateByExample(record, example);
	}

	@Override
	public List<Tiyuqicai> selectByExample(TiyuqicaiExample example) {
		
		return tiyuqicaiMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TiyuqicaiExample example) {
		
		return tiyuqicaiMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TiyuqicaiExample example) {
		
		return tiyuqicaiMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param tiyuqicai
	 * @return
	 */
	public int updateVisible(Tiyuqicai tiyuqicai) {
		return tiyuqicaiMapper.updateByPrimaryKeySelective(tiyuqicai);
	}


}

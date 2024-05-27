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
import com.reisen.mapper.auto.DiscusstiyuqicaiMapper;
import com.reisen.model.auto.Discusstiyuqicai;
import com.reisen.model.auto.DiscusstiyuqicaiExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 体育器材评论表 DiscusstiyuqicaiService
 * @Title: DiscusstiyuqicaiService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:21  
 **/
@Service
public class DiscusstiyuqicaiService implements BaseService<Discusstiyuqicai, DiscusstiyuqicaiExample>{
	@Autowired
	private DiscusstiyuqicaiMapper discusstiyuqicaiMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Discusstiyuqicai> list(Tablepar tablepar,Discusstiyuqicai discusstiyuqicai){
	        DiscusstiyuqicaiExample testExample=new DiscusstiyuqicaiExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(discusstiyuqicai);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Discusstiyuqicai> list= discusstiyuqicaiMapper.selectByExample(testExample);
	        PageInfo<Discusstiyuqicai> pageInfo = new PageInfo<Discusstiyuqicai>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			DiscusstiyuqicaiExample example=new DiscusstiyuqicaiExample();
			example.createCriteria().andIdIn(stringB);
			return discusstiyuqicaiMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Discusstiyuqicai selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return discusstiyuqicaiMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Discusstiyuqicai record) {
		return discusstiyuqicaiMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Discusstiyuqicai record) {
		
		record.setId(null);
		
		
		return discusstiyuqicaiMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Discusstiyuqicai record, DiscusstiyuqicaiExample example) {
		
		return discusstiyuqicaiMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Discusstiyuqicai record, DiscusstiyuqicaiExample example) {
		
		return discusstiyuqicaiMapper.updateByExample(record, example);
	}

	@Override
	public List<Discusstiyuqicai> selectByExample(DiscusstiyuqicaiExample example) {
		
		return discusstiyuqicaiMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(DiscusstiyuqicaiExample example) {
		
		return discusstiyuqicaiMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(DiscusstiyuqicaiExample example) {
		
		return discusstiyuqicaiMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param discusstiyuqicai
	 * @return
	 */
	public int updateVisible(Discusstiyuqicai discusstiyuqicai) {
		return discusstiyuqicaiMapper.updateByPrimaryKeySelective(discusstiyuqicai);
	}


}

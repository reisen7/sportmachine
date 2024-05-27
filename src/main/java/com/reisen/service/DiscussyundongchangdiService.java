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
import com.reisen.mapper.auto.DiscussyundongchangdiMapper;
import com.reisen.model.auto.Discussyundongchangdi;
import com.reisen.model.auto.DiscussyundongchangdiExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 运动场地评论表 DiscussyundongchangdiService
 * @Title: DiscussyundongchangdiService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:07:01  
 **/
@Service
public class DiscussyundongchangdiService implements BaseService<Discussyundongchangdi, DiscussyundongchangdiExample>{
	@Autowired
	private DiscussyundongchangdiMapper discussyundongchangdiMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Discussyundongchangdi> list(Tablepar tablepar,Discussyundongchangdi discussyundongchangdi){
	        DiscussyundongchangdiExample testExample=new DiscussyundongchangdiExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(discussyundongchangdi);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Discussyundongchangdi> list= discussyundongchangdiMapper.selectByExample(testExample);
	        PageInfo<Discussyundongchangdi> pageInfo = new PageInfo<Discussyundongchangdi>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			DiscussyundongchangdiExample example=new DiscussyundongchangdiExample();
			example.createCriteria().andIdIn(stringB);
			return discussyundongchangdiMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Discussyundongchangdi selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return discussyundongchangdiMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Discussyundongchangdi record) {
		return discussyundongchangdiMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Discussyundongchangdi record) {
		
		record.setId(null);
		
		
		return discussyundongchangdiMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Discussyundongchangdi record, DiscussyundongchangdiExample example) {
		
		return discussyundongchangdiMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Discussyundongchangdi record, DiscussyundongchangdiExample example) {
		
		return discussyundongchangdiMapper.updateByExample(record, example);
	}

	@Override
	public List<Discussyundongchangdi> selectByExample(DiscussyundongchangdiExample example) {
		
		return discussyundongchangdiMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(DiscussyundongchangdiExample example) {
		
		return discussyundongchangdiMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(DiscussyundongchangdiExample example) {
		
		return discussyundongchangdiMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param discussyundongchangdi
	 * @return
	 */
	public int updateVisible(Discussyundongchangdi discussyundongchangdi) {
		return discussyundongchangdiMapper.updateByPrimaryKeySelective(discussyundongchangdi);
	}


}

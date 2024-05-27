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
import com.reisen.mapper.auto.NewsMapper;
import com.reisen.model.auto.News;
import com.reisen.model.auto.NewsExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 体育资讯 NewsService
 * @Title: NewsService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:08:55  
 **/
@Service
public class NewsService implements BaseService<News, NewsExample>{
	@Autowired
	private NewsMapper newsMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<News> list(Tablepar tablepar,News news){
	        NewsExample testExample=new NewsExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(news);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<News> list= newsMapper.selectByExample(testExample);
	        PageInfo<News> pageInfo = new PageInfo<News>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			NewsExample example=new NewsExample();
			example.createCriteria().andIdIn(stringB);
			return newsMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public News selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return newsMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(News record) {
		return newsMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(News record) {
		
		record.setId(null);
		
		
		return newsMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(News record, NewsExample example) {
		
		return newsMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(News record, NewsExample example) {
		
		return newsMapper.updateByExample(record, example);
	}

	@Override
	public List<News> selectByExample(NewsExample example) {
		
		return newsMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(NewsExample example) {
		
		return newsMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(NewsExample example) {
		
		return newsMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param news
	 * @return
	 */
	public int updateVisible(News news) {
		return newsMapper.updateByPrimaryKeySelective(news);
	}


}

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
import com.reisen.mapper.auto.YundongchangdiMapper;
import com.reisen.model.auto.Yundongchangdi;
import com.reisen.model.auto.YundongchangdiExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 运动场地 YundongchangdiService
 * @Title: YundongchangdiService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 17:53:56  
 **/
@Service
public class YundongchangdiService implements BaseService<Yundongchangdi, YundongchangdiExample>{
	@Autowired
	private YundongchangdiMapper yundongchangdiMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Yundongchangdi> list(Tablepar tablepar,Yundongchangdi yundongchangdi){
	        YundongchangdiExample testExample=new YundongchangdiExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(yundongchangdi);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Yundongchangdi> list= yundongchangdiMapper.selectByExample(testExample);
	        PageInfo<Yundongchangdi> pageInfo = new PageInfo<Yundongchangdi>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			YundongchangdiExample example=new YundongchangdiExample();
			example.createCriteria().andIdIn(stringB);
			return yundongchangdiMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Yundongchangdi selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return yundongchangdiMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Yundongchangdi record) {
		return yundongchangdiMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Yundongchangdi record) {
		
		record.setId(null);
		
		
		return yundongchangdiMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Yundongchangdi record, YundongchangdiExample example) {
		
		return yundongchangdiMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Yundongchangdi record, YundongchangdiExample example) {
		
		return yundongchangdiMapper.updateByExample(record, example);
	}

	@Override
	public List<Yundongchangdi> selectByExample(YundongchangdiExample example) {
		
		return yundongchangdiMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(YundongchangdiExample example) {
		
		return yundongchangdiMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(YundongchangdiExample example) {
		
		return yundongchangdiMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param yundongchangdi
	 * @return
	 */
	public int updateVisible(Yundongchangdi yundongchangdi) {
		return yundongchangdiMapper.updateByPrimaryKeySelective(yundongchangdi);
	}


}

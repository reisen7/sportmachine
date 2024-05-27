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
import com.reisen.mapper.auto.TbreportrecordMapper;
import com.reisen.model.auto.Tbreportrecord;
import com.reisen.model.auto.TbreportrecordExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 器材保修 TbreportrecordService
 * @Title: TbreportrecordService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-26 23:52:42  
 **/
@Service
public class TbreportrecordService implements BaseService<Tbreportrecord, TbreportrecordExample>{
	@Autowired
	private TbreportrecordMapper tbreportrecordMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Tbreportrecord> list(Tablepar tablepar,Tbreportrecord tbreportrecord){
	        TbreportrecordExample testExample=new TbreportrecordExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tbreportrecord);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Tbreportrecord> list= tbreportrecordMapper.selectByExample(testExample);
	        PageInfo<Tbreportrecord> pageInfo = new PageInfo<Tbreportrecord>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
			
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TbreportrecordExample example=new TbreportrecordExample();
			example.createCriteria().andIdIn(stringB);
			return tbreportrecordMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Tbreportrecord selectByPrimaryKey(String id) {
		
			Integer id1 = Integer.valueOf(id);
			return tbreportrecordMapper.selectByPrimaryKey(id1);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Tbreportrecord record) {
		return tbreportrecordMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Tbreportrecord record) {
		
		record.setId(null);
		
		
		return tbreportrecordMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Tbreportrecord record, TbreportrecordExample example) {
		
		return tbreportrecordMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Tbreportrecord record, TbreportrecordExample example) {
		
		return tbreportrecordMapper.updateByExample(record, example);
	}

	@Override
	public List<Tbreportrecord> selectByExample(TbreportrecordExample example) {
		
		return tbreportrecordMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TbreportrecordExample example) {
		
		return tbreportrecordMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TbreportrecordExample example) {
		
		return tbreportrecordMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param tbreportrecord
	 * @return
	 */
	public int updateVisible(Tbreportrecord tbreportrecord) {
		return tbreportrecordMapper.updateByPrimaryKeySelective(tbreportrecord);
	}


}

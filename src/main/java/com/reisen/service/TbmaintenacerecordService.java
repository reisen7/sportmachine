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
import com.reisen.mapper.auto.TbmaintenacerecordMapper;
import com.reisen.model.auto.Tbmaintenacerecord;
import com.reisen.model.auto.TbmaintenacerecordExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 器材维护 TbmaintenacerecordService
 * @Title: TbmaintenacerecordService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-26 23:52:58  
 **/
@Service
public class TbmaintenacerecordService implements BaseService<Tbmaintenacerecord, TbmaintenacerecordExample>{
	@Autowired
	private TbmaintenacerecordMapper tbmaintenacerecordMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Tbmaintenacerecord> list(Tablepar tablepar,Tbmaintenacerecord tbmaintenacerecord){
	        TbmaintenacerecordExample testExample=new TbmaintenacerecordExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tbmaintenacerecord);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Tbmaintenacerecord> list= tbmaintenacerecordMapper.selectByExample(testExample);
	        PageInfo<Tbmaintenacerecord> pageInfo = new PageInfo<Tbmaintenacerecord>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
			
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TbmaintenacerecordExample example=new TbmaintenacerecordExample();
			example.createCriteria().andIdIn(stringB);
			return tbmaintenacerecordMapper.deleteByExample(example);
			
		
	}
	
	
	@Override
	public Tbmaintenacerecord selectByPrimaryKey(String id) {
		
			Integer id1 = Integer.valueOf(id);
			return tbmaintenacerecordMapper.selectByPrimaryKey(id1);
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Tbmaintenacerecord record) {
		return tbmaintenacerecordMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Tbmaintenacerecord record) {
		
		record.setId(null);
		
		
		return tbmaintenacerecordMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Tbmaintenacerecord record, TbmaintenacerecordExample example) {
		
		return tbmaintenacerecordMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Tbmaintenacerecord record, TbmaintenacerecordExample example) {
		
		return tbmaintenacerecordMapper.updateByExample(record, example);
	}

	@Override
	public List<Tbmaintenacerecord> selectByExample(TbmaintenacerecordExample example) {
		
		return tbmaintenacerecordMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(TbmaintenacerecordExample example) {
		
		return tbmaintenacerecordMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(TbmaintenacerecordExample example) {
		
		return tbmaintenacerecordMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param tbmaintenacerecord
	 * @return
	 */
	public int updateVisible(Tbmaintenacerecord tbmaintenacerecord) {
		return tbmaintenacerecordMapper.updateByPrimaryKeySelective(tbmaintenacerecord);
	}


}

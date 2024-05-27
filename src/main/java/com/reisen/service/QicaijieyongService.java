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
import com.reisen.mapper.auto.QicaijieyongMapper;
import com.reisen.model.auto.Qicaijieyong;
import com.reisen.model.auto.QicaijieyongExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 器材借用 QicaijieyongService
 * @Title: QicaijieyongService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:05:41  
 **/
@Service
public class QicaijieyongService implements BaseService<Qicaijieyong, QicaijieyongExample>{
	@Autowired
	private QicaijieyongMapper qicaijieyongMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Qicaijieyong> list(Tablepar tablepar,Qicaijieyong qicaijieyong){
	        QicaijieyongExample testExample=new QicaijieyongExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(qicaijieyong);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Qicaijieyong> list= qicaijieyongMapper.selectByExample(testExample);
	        PageInfo<Qicaijieyong> pageInfo = new PageInfo<Qicaijieyong>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			QicaijieyongExample example=new QicaijieyongExample();
			example.createCriteria().andIdIn(stringB);
			return qicaijieyongMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Qicaijieyong selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return qicaijieyongMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Qicaijieyong record) {
		return qicaijieyongMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Qicaijieyong record) {
		
		record.setId(null);
		
		
		return qicaijieyongMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Qicaijieyong record, QicaijieyongExample example) {
		
		return qicaijieyongMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Qicaijieyong record, QicaijieyongExample example) {
		
		return qicaijieyongMapper.updateByExample(record, example);
	}

	@Override
	public List<Qicaijieyong> selectByExample(QicaijieyongExample example) {
		
		return qicaijieyongMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(QicaijieyongExample example) {
		
		return qicaijieyongMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(QicaijieyongExample example) {
		
		return qicaijieyongMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param qicaijieyong
	 * @return
	 */
	public int updateVisible(Qicaijieyong qicaijieyong) {
		return qicaijieyongMapper.updateByPrimaryKeySelective(qicaijieyong);
	}


}

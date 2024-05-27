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
import com.reisen.mapper.auto.QuxiaoyuyueMapper;
import com.reisen.model.auto.Quxiaoyuyue;
import com.reisen.model.auto.QuxiaoyuyueExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 取消预约 QuxiaoyuyueService
 * @Title: QuxiaoyuyueService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:18:51  
 **/
@Service
public class QuxiaoyuyueService implements BaseService<Quxiaoyuyue, QuxiaoyuyueExample>{
	@Autowired
	private QuxiaoyuyueMapper quxiaoyuyueMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Quxiaoyuyue> list(Tablepar tablepar,Quxiaoyuyue quxiaoyuyue){
	        QuxiaoyuyueExample testExample=new QuxiaoyuyueExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(quxiaoyuyue);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Quxiaoyuyue> list= quxiaoyuyueMapper.selectByExample(testExample);
	        PageInfo<Quxiaoyuyue> pageInfo = new PageInfo<Quxiaoyuyue>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			QuxiaoyuyueExample example=new QuxiaoyuyueExample();
			example.createCriteria().andIdIn(stringB);
			return quxiaoyuyueMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Quxiaoyuyue selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return quxiaoyuyueMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Quxiaoyuyue record) {
		return quxiaoyuyueMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Quxiaoyuyue record) {
		
		record.setId(null);
		
		
		return quxiaoyuyueMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Quxiaoyuyue record, QuxiaoyuyueExample example) {
		
		return quxiaoyuyueMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Quxiaoyuyue record, QuxiaoyuyueExample example) {
		
		return quxiaoyuyueMapper.updateByExample(record, example);
	}

	@Override
	public List<Quxiaoyuyue> selectByExample(QuxiaoyuyueExample example) {
		
		return quxiaoyuyueMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(QuxiaoyuyueExample example) {
		
		return quxiaoyuyueMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(QuxiaoyuyueExample example) {
		
		return quxiaoyuyueMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param quxiaoyuyue
	 * @return
	 */
	public int updateVisible(Quxiaoyuyue quxiaoyuyue) {
		return quxiaoyuyueMapper.updateByPrimaryKeySelective(quxiaoyuyue);
	}


}

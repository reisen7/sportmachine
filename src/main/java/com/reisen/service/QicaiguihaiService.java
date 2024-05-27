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
import com.reisen.mapper.auto.QicaiguihaiMapper;
import com.reisen.model.auto.Qicaiguihai;
import com.reisen.model.auto.QicaiguihaiExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.reisen.util.StringUtils;

/**
 * 器材归还 QicaiguihaiService
 * @Title: QicaiguihaiService.java 
 * @Package com.reisen.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2024-04-11 18:06:09  
 **/
@Service
public class QicaiguihaiService implements BaseService<Qicaiguihai, QicaiguihaiExample>{
	@Autowired
	private QicaiguihaiMapper qicaiguihaiMapper;
	
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Qicaiguihai> list(Tablepar tablepar,Qicaiguihai qicaiguihai){
	        QicaiguihaiExample testExample=new QicaiguihaiExample();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(qicaiguihai);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<Qicaiguihai> list= qicaiguihaiMapper.selectByExample(testExample);
	        PageInfo<Qicaiguihai> pageInfo = new PageInfo<Qicaiguihai>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			QicaiguihaiExample example=new QicaiguihaiExample();
			example.createCriteria().andIdIn(stringB);
			return qicaiguihaiMapper.deleteByExample(example);
		
		
	}
	
	
	@Override
	public Qicaiguihai selectByPrimaryKey(String id) {
		
			Long id1 = Long.valueOf(id);
			return qicaiguihaiMapper.selectByPrimaryKey(id1);
			
		
	}

	
	@Override
	public int updateByPrimaryKeySelective(Qicaiguihai record) {
		return qicaiguihaiMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Qicaiguihai record) {
		
		record.setId(null);
		
		
		return qicaiguihaiMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Qicaiguihai record, QicaiguihaiExample example) {
		
		return qicaiguihaiMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Qicaiguihai record, QicaiguihaiExample example) {
		
		return qicaiguihaiMapper.updateByExample(record, example);
	}

	@Override
	public List<Qicaiguihai> selectByExample(QicaiguihaiExample example) {
		
		return qicaiguihaiMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(QicaiguihaiExample example) {
		
		return qicaiguihaiMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(QicaiguihaiExample example) {
		
		return qicaiguihaiMapper.deleteByExample(example);
	}
	
	/**
	 * 修改权限状态展示或者不展示
	 * @param qicaiguihai
	 * @return
	 */
	public int updateVisible(Qicaiguihai qicaiguihai) {
		return qicaiguihaiMapper.updateByPrimaryKeySelective(qicaiguihai);
	}


}

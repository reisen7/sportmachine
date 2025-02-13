package com.reisen.service;

import com.reisen.common.support.ConvertUtil;
import com.reisen.mapper.auto.SysProvinceMapper;
import com.reisen.model.auto.SysProvince;
import com.reisen.model.auto.SysProvinceExample;
import com.reisen.model.custom.Tablepar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 省份表 SysProvinceService
 * @Title: SysProvinceService.java
 * @Package com.reisen.service
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2024-10-04 19:56:15
 **/
@Service
public class SysProvinceService{
	@Autowired
	private SysProvinceMapper sysProvinceMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysProvince> list(Tablepar tablepar,String name){
	        SysProvinceExample testExample=new SysProvinceExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andProvinceNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<SysProvince> list= sysProvinceMapper.selectByExample(testExample);
	        PageInfo<SysProvince> pageInfo = new PageInfo<SysProvince>(list);
	        return  pageInfo;
	 }

	
	public int deleteByPrimaryKey(String ids) {
		Integer[] integers = ConvertUtil.toIntArray(",", ids);
		List<Integer> stringB = Arrays.asList(integers);
		SysProvinceExample example=new SysProvinceExample();
		example.createCriteria().andIdIn(stringB);
		return sysProvinceMapper.deleteByExample(example);
	}
	
	
	
	public SysProvince selectByPrimaryKey(Integer id) {
		
		return sysProvinceMapper.selectByPrimaryKey(id);
	}

	
	
	public int updateByPrimaryKeySelective(SysProvince record) {
		return sysProvinceMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 添加
	 */
	public int insertSelective(SysProvince record) {
		//添加主键id
		record.setId(null);
		return sysProvinceMapper.insertSelective(record);
	}
	
	
	
	public int updateByExampleSelective(SysProvince record, SysProvinceExample example) {
		
		return sysProvinceMapper.updateByExampleSelective(record, example);
	}

	
	
	public int updateByExample(SysProvince record, SysProvinceExample example) {
		
		return sysProvinceMapper.updateByExample(record, example);
	}

	
	public List<SysProvince> selectByExample(SysProvinceExample example) {
		
		return sysProvinceMapper.selectByExample(example);
	}

	
	
	public long countByExample(SysProvinceExample example) {
		
		return sysProvinceMapper.countByExample(example);
	}

	
	
	public int deleteByExample(SysProvinceExample example) {
		
		return sysProvinceMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysProvince
	 * @return
	 */
	public int checkNameUnique(SysProvince sysProvince){
		SysProvinceExample example=new SysProvinceExample();
		example.createCriteria().andProvinceNameEqualTo(sysProvince.getProvinceName());
		List<SysProvince> list=sysProvinceMapper.selectByExample(example);
		return list.size();
	}


}

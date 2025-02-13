package com.reisen.service;

import com.reisen.mapper.custom.SysUtilDao;
import com.reisen.model.custom.SQLAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUtilService {
	@Autowired
	private SysUtilDao dao;
	
	/**
	 * 执行sql
	 * @param sql
	 * @return
	 * @author fuce
	 * @date 2024年8月31日 下午6:15:08
	 */
	public int executeSQL(String sql){
		return dao.executeSQL(new SQLAdapter(sql));
	}
	
	
	/**
	 * 查询sql
	 * @param sql
	 * @return list<map>
	 * @author fuce
	 * @Date 2020年4月10日 下午4:55:49
	 */
	public List<Map<Object,Object>> SelectExecuteSQL(String sql){
		return dao.SelectExecuteSQL(new SQLAdapter(sql));
	}
}

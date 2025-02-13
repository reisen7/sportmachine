package com.reisen.mapper.custom;

import com.reisen.model.auto.TsysPermission;

import java.util.List;

public interface  PermissionDao {
	/**
	 * 查询全部权限 
	 * @return
	 */
	List<TsysPermission> findAll();
	 
	 /**
	  * 根据用户id查询出用户的所有权限
	  * @param userId
	  * @return
	  */
	 List<TsysPermission> findByAdminUserId(String userId);
	 
	 /**
	  * 根据角色id查询权限
	  * @param roleid
	  * @return
	  */
	 List<TsysPermission> queryRoleId(String roleid);

	 /**
	  * 根据角色id查询权限码集合 
	  * @param roleid
	  * @return
	  */
	 List<String> queryPermsList(String roleid);
	 
	 
	 
	 
}

package com.bohai.adviser.service;

import java.util.List;

import com.bohai.adviser.entity.dztg.SysPermission;
import com.bohai.adviser.vo.TreeView;

public interface PermissionService {
	

    /**
     * 仅查询用户拥有的权限
     * @param userId
     * @param permissionLevel
     * @return
     */
    public List<TreeView> queryUserPermissionTree(String userName,Long permissionLevel);
	
	/**
	 * 查询所有权限及用户是否拥有该权限
	 * @param userName
	 * @param parentPermissionId
	 * @return
	 */
	public List<TreeView<SysPermission>> queryUserPermissions(String userName, Long parentPermissionId);
	
	/**
	 * 更新用户权限
	 * @param userName
	 * @param list
	 */
	public void updateUserPermissions(String userName, List<TreeView<SysPermission>> list);

	
	public List<TreeView> queryAllPermission(String parentPermissionId);
}

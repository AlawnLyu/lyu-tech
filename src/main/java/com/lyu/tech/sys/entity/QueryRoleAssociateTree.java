package com.lyu.tech.sys.entity;

import com.lyu.tech.common.base.entity.QueryBase;

/**
 *@author lyu
 **/
public class QueryRoleAssociateTree extends QueryBase {
 private Long roleId;
 private Long treeId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getTreeId() {
		return treeId;
	}

	public void setTreeId(Long treeId) {
		this.treeId = treeId;
	}

}

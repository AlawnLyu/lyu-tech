package com.lyu.csdndemo.sys.entity;

import com.lyu.csdndemo.common.base.entity.QueryBase;

/**
 *@author lyu
 **/
public class QueryUserAssociateRole extends QueryBase {
 private Integer userId;
 private Long roleId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}

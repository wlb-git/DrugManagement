package com.bdqn.pojo;


/**
 * 用户角色
 * @author Peng
 *
 */

public class Role {

	private Integer roleid;//角色id
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	private String roleName;//用户角色
	private String note;//备注
}

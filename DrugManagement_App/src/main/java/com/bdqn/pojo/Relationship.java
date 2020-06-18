package com.bdqn.pojo;
/**
 * 关系表
 * @author Peng
 *
 */


public class Relationship {
	public Integer getRelationshipId() {
		return relationshipId;
	}
	public void setRelationshipId(Integer relationshipId) {
		this.relationshipId = relationshipId;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getNote() {
		return note;
	}
	public void setNote(Integer note) {
		this.note = note;
	}

	private Integer relationshipId;//关系表编号
	private Integer userid;//用户Id
	private Integer roleid;//角色Id
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	private Integer note;
}

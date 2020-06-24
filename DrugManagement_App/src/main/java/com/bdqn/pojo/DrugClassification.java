package com.bdqn.pojo;
/**
 * 药品分类
 * @author Peng
 *
 */



public class DrugClassification {

	private Integer fictionId;//药品分类编号
	private String fictionType;//药品类型
	private String note;
	public Integer getFictionId() {
		return fictionId;
	}
	public void setFictionId(Integer fictionId) {
		this.fictionId = fictionId;
	}	
	public String getFictionType() {
		return fictionType;
	}
	public void setFictionType(String fictionType) {
		this.fictionType = fictionType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}

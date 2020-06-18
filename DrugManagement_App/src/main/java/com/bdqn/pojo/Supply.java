package com.bdqn.pojo;

/**
 * 货源表
 * @author Peng
 *
 */


public class Supply {

	private Integer supplyid;//货源id
	private String  suplyName;//货源名称
	private Integer reliability;//货源可信度
	private Integer note;//备注
	public Integer getSupplyid() {
		return supplyid;
	}
	public void setSupplyid(Integer supplyid) {
		this.supplyid = supplyid;
	}
	public String getSuplyName() {
		return suplyName;
	}
	public void setSuplyName(String suplyName) {
		this.suplyName = suplyName;
	}
	public Integer getReliability() {
		return reliability;
	}
	public void setReliability(Integer reliability) {
		this.reliability = reliability;
	}
	public Integer getNote() {
		return note;
	}
	public void setNote(Integer note) {
		this.note = note;
	}
}

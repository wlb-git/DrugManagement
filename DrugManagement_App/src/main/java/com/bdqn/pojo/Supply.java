package com.bdqn.pojo;

/**
 * 货源表
 * @author Peng
 *
 */


public class Supply {

	@Override
	public String toString() {
		return "Supply [supplyid=" + supplyid + ", suplyName=" + suplyName + ", reliability=" + reliability + ", note="
				+ note + "]";
	}
	private Integer supplyid;//货源id
	private String  suplyName;//货源名称
	private Integer reliability;//货源可信度
	private String note;//备注
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}

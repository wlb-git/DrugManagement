package com.bdqn.pojo;
/**
 * 药品进货记录表
 * @author Peng
 *
 */

public class Sock {

	private Integer sockId;//进货Id
	private String sockName;//药品名
	private String sockTime;//进货时间
	private String note;
	public Integer getSockId() {
		return sockId;
	}
	public void setSockId(Integer sockId) {
		this.sockId = sockId;
	}
	public String getSockName() {
		return sockName;
	}
	public void setSockName(String sockName) {
		this.sockName = sockName;
	}
	public String getSockTime() {
		return sockTime;
	}
	public void setSockTime(String sockTime) {
		this.sockTime = sockTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}

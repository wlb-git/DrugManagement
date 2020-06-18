package com.bdqn.pojo;



/**
 * 出货记录
 * @author Peng
 *
 */

public class Shipment {
	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipTime() {
		return shipTime;
	}
	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	private Integer shipId;//进货Id
	private String shipName;//药品名
	private String shipTime;//出货时间
	private String note;
}

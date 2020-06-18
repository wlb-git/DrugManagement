package com.bdqn.pojo;

import java.util.Date;


/**
 * tui
 * @author Peng
 *退货
 */

public class Replenish {

	private Integer replenishId;//退货Id
	private String  replenishPepole;//退货人
	private Date replenishTime;//退货时间
	private Integer replenishName;//退货药品名
	public Integer getReplenishId() {
		return replenishId;
	}
	public void setReplenishId(Integer replenishId) {
		this.replenishId = replenishId;
	}
	public String getReplenishPepole() {
		return replenishPepole;
	}
	public void setReplenishPepole(String replenishPepole) {
		this.replenishPepole = replenishPepole;
	}
	public Date getReplenishTime() {
		return replenishTime;
	}
	public void setReplenishTime(Date replenishTime) {
		this.replenishTime = replenishTime;
	}
	public Integer getReplenishName() {
		return replenishName;
	}
	public void setReplenishName(Integer replenishName) {
		this.replenishName = replenishName;
	}
}

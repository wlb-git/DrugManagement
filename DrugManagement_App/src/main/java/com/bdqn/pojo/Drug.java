package com.bdqn.pojo;

import java.util.Date;

/**
 * 药品表
 * @author Peng
 *
 */
public class Drug {

	private Integer drugid;//药品编号
	private String drugPrice;//药品价格
	private String drugName;//药品名称
	private Integer drugType;//药品类型
	private Date drugShelflife;//药品保质期
	private Integer drugDeliveryrecord;//药品出货记录
	private Integer drugCount;//药品数量
	private Integer drugPurchaserecord;//药品进货记录
	private Integer Pharmaceutical;//药品冻结
	private Integer Supplyid;//货源
	private String note;//备注
	public Integer getId() {
		return drugid;
	}
	public void setId(Integer id) {
		this.drugid = id;
	}
	public String getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(String drugPrice) {
		this.drugPrice = drugPrice;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Integer getDrugType() {
		return drugType;
	}
	public void setDrugType(Integer drugType) {
		this.drugType = drugType;
	}
	public Date getDrugShelflife() {
		return drugShelflife;
	}
	public void setDrugShelflife(Date drugShelflife) {
		this.drugShelflife = drugShelflife;
	}
	public Integer getDrugDeliveryrecord() {
		return drugDeliveryrecord;
	}
	public void setDrugDeliveryrecord(Integer drugDeliveryrecord) {
		this.drugDeliveryrecord = drugDeliveryrecord;
	}
	public Integer getDrugCount() {
		return drugCount;
	}
	public void setDrugCount(Integer drugCount) {
		this.drugCount = drugCount;
	}
	public Integer getDrugPurchaserecord() {
		return drugPurchaserecord;
	}
	public void setDrugPurchaserecord(Integer drugPurchaserecord) {
		this.drugPurchaserecord = drugPurchaserecord;
	}
	public Integer getPharmaceutical() {
		return Pharmaceutical;
	}
	public void setPharmaceutical(Integer pharmaceutical) {
		Pharmaceutical = pharmaceutical;
	}
	public Integer getSupply() {
		return Supplyid;
	}
	public void setSupply(Integer supply) {
		Supplyid= supply;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}

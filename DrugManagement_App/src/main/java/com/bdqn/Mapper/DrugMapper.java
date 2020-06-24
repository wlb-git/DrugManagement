package com.bdqn.Mapper;

import java.util.List;

import com.bdqn.pojo.DrugClassification;

/**
 * @author WangJian
 *
 */
public interface DrugMapper {
	/**
	 * @author WangJian
	 * @return
	 */
	public List<DrugClassification> findDrugType();
	
	/**
	 * @author WangJian
	 * @return
	 */
	public int addDrugType(DrugClassification drug);
}

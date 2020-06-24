package com.bdqn.Server;

import java.util.List;

import com.bdqn.pojo.DrugClassification;

/**
 * 
 * @author WangJian01——0
 *
 */
public interface DrugServer {
	/**
	 * @author WangJian1
	 * @return
	 */
	public List<DrugClassification> findDrugType();
	
	/**
	 * @author WangJian1
	 */
	public int addDrugType(DrugClassification drug);
}

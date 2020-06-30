package com.bdqn.Server;

import java.util.List;

import com.bdqn.pojo.Drug;
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
	
	/**
	 * @author WangJian
	 * @param id
	 * @return
	 */
	public int deleteDrugType(int fictionId);
	
	/**
	 * @author WangJian[根据药品编号查询所需数据]
	 * @param drugid
	 * @return
	 */
	public Drug findById(int drugid);
	/**
	 * @author WangJian[冻结（修改数据）]
	 * @param drug
	 * @return
	 */
	public int dongJie(Drug drug);
	/**
	 * @author WangJian[解冻（修改数据）]
	 * @param drug
	 * @return
	 */
	public int jieDong(Drug drug);
	
	
	/**
	 * @author WangJian[根据id查询冻结状态]
	 * @param drugid
	 * @return
	 */
	public int findByIdPr(int drugid);
}

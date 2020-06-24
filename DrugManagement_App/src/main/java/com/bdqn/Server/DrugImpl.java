package com.bdqn.Server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.DrugMapper;
import com.bdqn.pojo.DrugClassification;

/**
 * 
 * @author WangJian010——0
 *
 */
@Service
public class DrugImpl implements DrugServer {
	/**
	 * @author WangJian010
	 */
	@Resource
	private DrugMapper mapper;
	
	/**
	 * @author WangJian1
	 */
	@Override
	public List<DrugClassification> findDrugType() {
		// TODO Auto-generated method stub
		return mapper.findDrugType();
	}

	@Override
	public int addDrugType(DrugClassification drug) {
		// TODO Auto-generated method stub
		return mapper.addDrugType(drug);
	}

	

}

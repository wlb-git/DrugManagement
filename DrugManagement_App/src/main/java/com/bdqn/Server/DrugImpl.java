package com.bdqn.Server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.DrugMapper;
import com.bdqn.pojo.Drug;
import com.bdqn.pojo.DrugClassification;

/**
 * 
 * @author WangJian01X
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

	@Override
	public int deleteDrugType(int fictionId) {
		// TODO Auto-generated method stub
		return mapper.deleteDrugType(fictionId);
	}

	@Override
	public Drug findById(int drugid) {
		// TODO Auto-generated method stub
		return mapper.findById(drugid);
	}

	@Override
	public int dongJie(Drug drug) {
		// TODO Auto-generated method stub
		return mapper.dongJie(drug);
	}

	@Override
	public int jieDong(Drug drug) {
		// TODO Auto-generated method stub
		return mapper.jieDong(drug);
	}

	@Override
	public int findByIdPr(int drugid) {
		// TODO Auto-generated method stub
		return mapper.findByIdPr(drugid);
	}

	

}

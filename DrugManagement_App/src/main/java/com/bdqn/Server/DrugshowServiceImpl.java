package com.bdqn.Server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.DrugshowMapper;
import com.bdqn.pojo.Drug;
@Service
public class DrugshowServiceImpl implements DrugshowService {
	
   @Resource
	private DrugshowMapper drugshowMapper;
	
	@Override
	public List<Drug> DrugList() {
		// TODO Auto-generated method stub
		return drugshowMapper.DrugList();
	}

}

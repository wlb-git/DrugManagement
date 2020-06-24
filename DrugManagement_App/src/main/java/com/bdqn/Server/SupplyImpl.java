package com.bdqn.Server;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.SupplyMapper;
import com.bdqn.pojo.Supply;

@Service
public class SupplyImpl implements SupplyServer {
	/**
	 *  @author WangJian01
	 */
	@Resource
	private SupplyMapper mapper;
	
	/**
	 * @author WangJian1
	 * */
	@Override
	public int addSupply(Supply supply) {
		// TODO Auto-generated method stub
		return mapper.addSupply(supply);
	}

}

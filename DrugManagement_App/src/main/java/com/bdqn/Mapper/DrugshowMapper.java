package com.bdqn.Mapper;

import java.util.List;

import com.bdqn.pojo.Drug;

public interface DrugshowMapper {
   
	/**
	 * 全部药品展示
	 * @return
	 */
	public List<Drug> DrugList(); 
}

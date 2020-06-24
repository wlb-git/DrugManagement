package com.bdqn.Server;

import java.util.List;

import com.bdqn.pojo.Drug;

public interface DrugshowService {
	/**
	 * 全部药品展示
	 * @return
	 */
	public List<Drug> DrugList(); 
}

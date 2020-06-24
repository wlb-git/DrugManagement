package com.bdqn.Test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdqn.Server.DrugshowService;
import com.bdqn.pojo.Drug;

@Controller	
public class DrugshowContorller {
    @Resource
	private DrugshowService drugshowService;
    
	@RequestMapping(value="/Drugshow")
    public String DrugShowContorller(Model model) {
		  List<Drug> list=drugshowService.DrugList();
		  model.addAttribute("list",list);
		  	
    	return	 "table_data_tablesYP";
    }
	
	
}

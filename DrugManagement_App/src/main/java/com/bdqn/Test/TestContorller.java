package com.bdqn.Test;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdqn.Server.DrugServer;
import com.bdqn.Server.PruServer;
import com.bdqn.Server.SupplyServer;
import com.bdqn.pojo.DrugClassification;
import com.bdqn.pojo.Supply;

/**
 * 
 * @author WangJian
 *
 */
@Controller
public class TestContorller {

	@Resource
	private PruServer pruServer;

	/**
	 * 王健
	 */
	@Resource
	private SupplyServer suServer;

	@Resource
	private DrugServer drServer;

	/**
	 * 登录页面的跳转
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Loginget")
	public String LoginGet() {
		return "login";
	}

	/**
	 * @author WangJian
	 * @param supply
	 * @return
	 */
	@RequestMapping(value = "/addSupply")
	public String addSupply(Supply supply) {
		int i = suServer.addSupply(supply);
		System.out.println("000" + supply.toString());
		return "form_basicHY";
	}

	/**
	 * @author WangJian
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/findDrugType")
	public String findDrugType(ModelMap map) {
		List<DrugClassification> list = drServer.findDrugType();
		map.addAttribute("findtype", list);
		return "table_data_tablesYPLX";
	}

	@RequestMapping(value = "/addDrugType")
	public String addDrugType(DrugClassification drug) {
		int i = drServer.addDrugType(drug);
		System.out.println("1111" + drug.toString());
		return "form_basicYPLX";
	}
}

package com.bdqn.Test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdqn.Server.UserService;
import com.bdqn.pojo.User;

@Controller
public class UserContorller {
    @Resource
	private UserService userService;
	
	@RequestMapping("/UserList")
	public String UserList(Model model) {
		  List<User> list=userService.UserList();
		  model.addAttribute("list",list);
		return "table_data_tablesYG";
	}
}

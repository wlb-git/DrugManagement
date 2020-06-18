package com.bdqn.Test;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bdqn.Server.PruServer;


@Controller
public class TestContorller {
	
	@Resource
	private PruServer pruServer;
	/**
	 * 登录页面的跳转
	 * @return
	 */
    @RequestMapping(value="/Loginget") 
	public String LoginGet() {
    	  return "login";
     }
     
}

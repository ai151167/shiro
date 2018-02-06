package com.qsy.demo.shiro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsy.demo.shiro.entity.User;
import com.qsy.demo.shiro.service.ILoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
		
	@Autowired
	private ILoginService loginServiceImpl;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "admin/login";
	}
	
	@RequestMapping("/login")
	public String login(User user,ModelMap map) {
		Map<String, Object> result = loginServiceImpl.login(user);
		Boolean isOk = (Boolean) result.get("SUCCESS");
		String msg = (String) result.get("MSG");
		map.put("MSG",msg );
		if(isOk) {
			return "goods/goodsList";
		}else {
			return "admin/login";
		}
		
		
	}
}

package com.qsy.demo.shiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsy.demo.shiro.entity.User;
import com.qsy.demo.shiro.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping("/userInfo")
	public String toUser(Integer userId,ModelMap map) {
		User user = userServiceImpl.userInfoById(userId);
		map.put("userInfo", user);
		return "admin/userInfo";
	}
}

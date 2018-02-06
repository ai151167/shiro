package com.qsy.demo.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/userInfo")
	public String toUser() {
		return "admin/userInfo";
	}
}

package com.qsy.demo.shiro.service;

import java.util.Map;

import com.qsy.demo.shiro.entity.User;

public interface ILoginService {

	Map<String, Object> login(User user);

}

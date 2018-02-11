package com.qsy.demo.shiro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsy.demo.shiro.entity.User;
import com.qsy.demo.shiro.entity.mapper.UserMapper;
import com.qsy.demo.shiro.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User userInfoById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
}

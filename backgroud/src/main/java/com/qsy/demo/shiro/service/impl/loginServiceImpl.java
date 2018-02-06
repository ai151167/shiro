package com.qsy.demo.shiro.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsy.demo.shiro.entity.User;
import com.qsy.demo.shiro.entity.UserExample;
import com.qsy.demo.shiro.entity.mapper.UserMapper;
import com.qsy.demo.shiro.service.ILoginService;

@Service
public class loginServiceImpl implements ILoginService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Map<String, Object> login(User user) {
		Map<String, Object> result = new HashMap<>();
		UserExample example = new UserExample();
		example.createCriteria().andUserAccountEqualTo(user.getUserAccount()).andUserStateEqualTo("01");
		List<User> byExample = userMapper.selectByExample(example);
		if(byExample!=null&&byExample.size()>0) {
			if(user.getUserPassword().equals(byExample.get(0).getUserPassword())) {
				result.put("SUCCESS", true);
				result.put("MSG", "登录成功!");
			}else {
				result.put("SUCCESS", false);
				result.put("MSG", "密码不正确!");
			}
		}else {
			result.put("SUCCESS", false);
			result.put("MSG", "帐号不存在!");
		}
		
		return result;
	}

}

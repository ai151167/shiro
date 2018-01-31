package com.qsy.demo.shiro.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsy.demo.shiro.entity.SortInfo;
import com.qsy.demo.shiro.service.ISortInfoService;

@Controller
@RequestMapping("/sortInfo")
public class SortController {

	@Autowired
	private ISortInfoService sortInfoService;
	
	@ResponseBody
	@RequestMapping("/sortInfoList")
	public List<Map<String, Object>> sortInfoList(Integer id) {
		if(id ==null||"".equals(id.toString())) {
			id = -1;
		}
		List<Map<String, Object>> list = new ArrayList<>(); 
		List<SortInfo> sortInfos = sortInfoService.sortInfoList(id);
		for (SortInfo sortInfo : sortInfos) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", sortInfo.getSortId());
			map.put("name", sortInfo.getSortName());
			list.add(map);
		}
		return list;
	}
}

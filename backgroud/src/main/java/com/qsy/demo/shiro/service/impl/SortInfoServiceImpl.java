package com.qsy.demo.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsy.demo.shiro.entity.SortInfo;
import com.qsy.demo.shiro.entity.SortInfoExample;
import com.qsy.demo.shiro.entity.mapper.SortInfoMapper;
import com.qsy.demo.shiro.service.ISortInfoService;

@Service("/sortInfoService")
public class SortInfoServiceImpl implements ISortInfoService {

	@Autowired
	private SortInfoMapper sortInfoMapper;

	@Override
	public List<SortInfo> sortInfoList(Integer id) {
		SortInfoExample example = new SortInfoExample();
		example.createCriteria().andSortParentEqualTo(id).andSortStateEqualTo("01");
		return sortInfoMapper.selectByExample(example );
	}
	
}

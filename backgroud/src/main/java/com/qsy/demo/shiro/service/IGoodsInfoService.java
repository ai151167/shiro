package com.qsy.demo.shiro.service;

import java.util.Map;

import com.qsy.demo.shiro.entity.vo.GoodsInfoOperation;
import com.qsy.demo.shiro.entity.vo.GoodsInfoParam;


public interface IGoodsInfoService {

	Map<String, Object> goodsInfoList(GoodsInfoParam param);

	String addGoodsInfo(GoodsInfoOperation goodsInfo);

	GoodsInfoOperation goodsInfo(Integer goodsId);

	String updateGoodsInfo(GoodsInfoOperation goodsInfo);

	String deleteGoodsInfo(Integer goodsId);

}

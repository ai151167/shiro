package com.qsy.demo.shiro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsy.demo.shiro.entity.vo.GoodsInfoOperation;
import com.qsy.demo.shiro.entity.vo.GoodsInfoParam;
import com.qsy.demo.shiro.service.IGoodsInfoService;

@Controller
@RequestMapping("/goodsInfo")
public class GoodsController {

	@Autowired
	private IGoodsInfoService goodsInfoService;

	@RequestMapping("/goods")
	public String goodsInfo() {
		return "goods/goodsList";
	}
	
	@RequestMapping("/list")
	public String goods() {
		return "goods/goods";
	}
	
	
	@RequestMapping("/goodsInfoList")
	public String goodsInfoList(GoodsInfoParam param,ModelMap map) {
		Map<String, Object> result = goodsInfoService.goodsInfoList(param);
		map.put("goodsInfos", result.get("goodsInfos"));
		map.put("count", result.get("count"));
		map.put("pages", result.get("pages"));
		return "goods/goods";
	}

	
	public String addGoodsInfo(GoodsInfoOperation goodsInfo) {
		return goodsInfoService.addGoodsInfo(goodsInfo);
	}

	@ResponseBody
	@RequestMapping("/goodsInfo")
	public GoodsInfoOperation goodsInfo(Integer goodsId) {
		return goodsInfoService.goodsInfo(goodsId);
	}

	
	public String updateGoodsInfo(GoodsInfoOperation goodsInfo) {
		return goodsInfoService.updateGoodsInfo(goodsInfo);
	}

	@ResponseBody
	@RequestMapping("/deleteGoodsInfo")
	public String deleteGoodsInfo(Integer goodsId) {
		return goodsInfoService.deleteGoodsInfo(goodsId);
	}
	
	@ResponseBody
	@RequestMapping("/saveGoodsInfo")
	public String saveGoodsInfo(GoodsInfoOperation goodsInfo) {
		if(goodsInfo!=null&&goodsInfo.getGoodsId()!=null&&!"".equals(goodsInfo.getGoodsId().toString())) {
			return updateGoodsInfo(goodsInfo);
		}else {
			return addGoodsInfo(goodsInfo);
		}
	}
}

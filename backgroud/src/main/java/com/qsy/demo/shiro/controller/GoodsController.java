package com.qsy.demo.shiro.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsy.demo.shiro.common.resultbean.ResultBean;
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

	
	public ResultBean<String> addGoodsInfo(GoodsInfoOperation goodsInfo) {
		return new ResultBean<>(goodsInfoService.addGoodsInfo(goodsInfo));
	}

	@ResponseBody
	@RequestMapping("/goodsInfo")
	public ResultBean<GoodsInfoOperation> goodsInfo(Integer goodsId) {
		return new ResultBean<>( goodsInfoService.goodsInfo(goodsId));
	}

	
	public ResultBean<String> updateGoodsInfo(GoodsInfoOperation goodsInfo) {
		return new ResultBean<>(goodsInfoService.updateGoodsInfo(goodsInfo));
	}

	@ResponseBody
	@RequestMapping("/deleteGoodsInfo")
	public String deleteGoodsInfo(Integer goodsId) {
		return goodsInfoService.deleteGoodsInfo(goodsId);
	}
	
	@ResponseBody
	@RequestMapping("/saveGoodsInfo")
	public ResultBean<String> saveGoodsInfo(GoodsInfoOperation goodsInfo) {
		if(goodsInfo!=null&&goodsInfo.getGoodsId()!=null&&!"".equals(goodsInfo.getGoodsId().toString())) {
			return updateGoodsInfo(goodsInfo);
		}else {
			return addGoodsInfo(goodsInfo);
		}
	}
	
	@ResponseBody
	@RequestMapping("/deleteGoodsInfoAll")
	public String deleteGoodsInfoAll(String ids) {
		List<Integer> list = new ArrayList<>();
		String result = "删除失败！";
		if(ids!=null&&!"".equals(ids)) {
			String[] idList = ids.split(",");
			for (String idString : idList) {
				list.add(Integer.parseInt(idString));
			}
			result = goodsInfoService.deleteGoodsInfoAll(list);
		}
		return result;
		
	}
}

package com.qsy.demo.shiro.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsy.demo.shiro.entity.GoodsInfo;
import com.qsy.demo.shiro.entity.GoodsSortRelation;
import com.qsy.demo.shiro.entity.mapper.GoodsInfoMapper;
import com.qsy.demo.shiro.entity.mapper.GoodsSortRelationMapper;
import com.qsy.demo.shiro.entity.vo.GoodsInfoOperation;
import com.qsy.demo.shiro.entity.vo.GoodsInfoParam;
import com.qsy.demo.shiro.service.IGoodsInfoService;



@Service("goodsInfoService")
public class GoodsInfoServiceImpl implements IGoodsInfoService {

	@Autowired
	private GoodsInfoMapper goodsInfoMapper;
	
	@Autowired
	private GoodsSortRelationMapper goodsSortRelationMapper;
	
	/**
	 * 集合
	 */
	@Override
	public Map<String, Object> goodsInfoList(GoodsInfoParam param) {
		Map<String, Object> result = new HashMap<>();
		List<GoodsInfo> goodsInfos =  goodsInfoMapper.selectByGoodsCondition(param);
		Integer count = count(param);
		Integer pages =pages(count, param.getPageSize());
		result.put("goodsInfos", goodsInfos);
		result.put("count", count);
		result.put("pages", pages);
		return result;
		
	}
	
	/**
	 * 获取查询的总个数
	 * @param param
	 * @return
	 */
	protected Integer count(GoodsInfoParam param) {
		return goodsInfoMapper.selectCountByGoodsCondition(param);
	}
	
	/**
	 * 获取分页总数
	 * @param count
	 * @param pageSize
	 * @return
	 */
	protected Integer pages(Integer count,Integer pageSize) {
		 Integer pages = count%pageSize==0?count/pageSize:count/pageSize+1;
		 if(pages==0) {
			 pages =1;
		 }
		return pages;
	}

	/**
	 * 添加信息
	 */
	@Override
	public String addGoodsInfo(GoodsInfoOperation goodsInfo) {
		Integer sortId = goodsInfo.getSortId();
		Integer goodsId = goodsInfoMapper.addGoodsInfo(goodsInfo);
		if(goodsId>0) {
			GoodsSortRelation rel = new GoodsSortRelation();
			rel.setGoodsId(goodsId);
			rel.setSortId(sortId);
			rel.setGoodsSortState("01");
			goodsSortRelationMapper.insert(rel);
			return "添加成功!";
		}
		return "添加失败!";
	}

	/**
	 * 获取详情
	 *	QSY
	 * @param goodsId
	 * @return
	 */
	@Override
	public GoodsInfoOperation goodsInfo(Integer goodsId) {
		return goodsInfoMapper.goodsInfo(goodsId);
	}

	/**
	 * 修改信息
	 *	QSY
	 * @param goodsInfo
	 * @return
	 */
	
	@Override
	public String updateGoodsInfo(GoodsInfoOperation goodsInfo) {
		goodsInfoMapper.updateGoodsInfo(goodsInfo);
		if(goodsInfo.getSortId()!=null&&!"".equals(goodsInfo.getSortId().toString())) {
			GoodsSortRelation rel = new GoodsSortRelation();
			rel.setGoodsId(goodsInfo.getGoodsId());
			rel.setSortId(goodsInfo.getSortId());
			goodsSortRelationMapper.updateByPrimaryKeySelective(rel);
		}
		return "修改完成!";
	}

	/**
	 * 删除信息
	 *	QSY
	 * @param goodsId
	 * @return
	 */
	@Override
	public String deleteGoodsInfo(Integer goodsId) {
		String result = "删除失败!";
		GoodsInfo gInfo = new GoodsInfo();
		gInfo.setGoodsId(goodsId);
		gInfo.setGoodsState("00");
		int i = goodsInfoMapper.updateByPrimaryKeySelective(gInfo);
		if(i>0) {
			result = "删除成功!";
		}
		return result;
	}
}

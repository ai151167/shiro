package com.qsy.demo.shiro.entity.vo;
import com.qsy.demo.shiro.entity.GoodsInfo;

public class GoodsInfoOperation extends GoodsInfo {

	private Integer sortId;
	
	private String sortName;
	

	public Integer getSortId() {
		return sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
}

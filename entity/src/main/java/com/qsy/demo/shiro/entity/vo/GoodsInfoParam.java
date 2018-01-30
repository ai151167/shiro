package com.qsy.demo.shiro.entity.vo;

public class GoodsInfoParam {
	
	private Integer start = 0;
	
	private Integer pageSize = 5;
	
	private Integer sortId;
	
	private String sortName;
	
	private Integer goodsId;
	
	private String goodsName;
	
	private String goodsDesc;
	
	private Integer goodsCount;
	
	private Integer lowCount;
	
	private Integer tallCount;
	
	private Double lowPrice;
	
	private Double tallPrice;
	
	private Double goodsPrice;
	
	
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

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getLowCount() {
		return lowCount;
	}

	public void setLowCount(Integer lowCount) {
		this.lowCount = lowCount;
	}

	public Integer getTallCount() {
		return tallCount;
	}

	public void setTallCount(Integer tallCount) {
		this.tallCount = tallCount;
	}

	public double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public double getTallPrice() {
		return tallPrice;
	}

	public void setTallPrice(double tallPrice) {
		this.tallPrice = tallPrice;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	
}

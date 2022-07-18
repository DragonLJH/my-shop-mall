package com.dragon.demo.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "shop")
public class Shop {


	@TableId(value = "shop_id", type = IdType.AUTO)
	private Integer shopId;

	@TableField(value = "user_name")
	private String userName;

	@TableField(value = "product_id")
	private Integer productId;

	@TableField(value = "product_rotation_img")
	private String productRotationImg;

	@TableField(value = "product_name")
	private String productName;

	@TableField(value = "select_size")
	private String selectSize;

	@TableField(value = "select_color")
	private String selectColor;

	@TableField(value = "product_selling_price")
	private Double productSellingPrice;

	@TableField(value = "select_num")
	private Integer selectNum;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductRotationImg() {
		return productRotationImg;
	}

	public void setProductRotationImg(String productRotationImg) {
		this.productRotationImg = productRotationImg;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSelectSize() {
		return selectSize;
	}

	public void setSelectSize(String selectSize) {
		this.selectSize = selectSize;
	}

	public String getSelectColor() {
		return selectColor;
	}

	public void setSelectColor(String selectColor) {
		this.selectColor = selectColor;
	}

	public Double getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(Double productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}

	public Integer getSelectNum() {
		return selectNum;
	}

	public void setSelectNum(Integer selectNum) {
		this.selectNum = selectNum;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", userName=" + userName + ", productId=" + productId
				+ ", productRotationImg=" + productRotationImg + ", productName=" + productName + ", selectSize="
				+ selectSize + ", selectColor=" + selectColor + ", productSellingPrice=" + productSellingPrice
				+ ", selectNum=" + selectNum + "]";
	}

	
	

}

package com.dragon.demo.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "my_order")
public class Order {

	@TableId(value = "order_id", type = IdType.AUTO)
	private Integer orderId;

	@TableField(value = "order_number")
	private String orderNumber;

	@TableField(value = "order_creation_time")
	private String orderCreationTime;

	@TableField(value = "order_payment_time")
	private String orderPaymentTime;

	@TableField(value = "order_delivery_time")
	private String orderDeliveryTime;

	@TableField(value = "user_name")
	private String userName;

	@TableField(value = "product_id")
	private Integer productId;

	@TableField(value = "product_name")
	private String productName;

	@TableField(value = "product_rotation_img")
	private String productRotationImg;

	@TableField(value = "product_selling_price")
	private Double productSellingPrice;

	@TableField(value = "select_num")
	private Integer selectNum;

	@TableField(value = "order_total")
	private Double orderTotal;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderCreationTime() {
		return orderCreationTime;
	}

	public void setOrderCreationTime(String orderCreationTime) {
		this.orderCreationTime = orderCreationTime;
	}

	public String getOrderPaymentTime() {
		return orderPaymentTime;
	}

	public void setOrderPaymentTime(String orderPaymentTime) {
		this.orderPaymentTime = orderPaymentTime;
	}

	public String getOrderDeliveryTime() {
		return orderDeliveryTime;
	}

	public void setOrderDeliveryTime(String orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductRotationImg() {
		return productRotationImg;
	}

	public void setProductRotationImg(String productRotationImg) {
		this.productRotationImg = productRotationImg;
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

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

}

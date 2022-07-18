package com.dragon.demo.common;

import org.apache.commons.lang3.StringUtils;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "product")
public class ProductDb {

	@TableId(value = "product_id", type = IdType.AUTO)
	private Integer productId;

	@TableField(value = "product_name")
	private String productName;

	@TableField(value = "product_msg")
	private String productMsg;

	@TableField(value = "product_price")
	private Double productPrice;

	@TableField(value = "product_selling_price")
	private Double productSellingPrice;

	@TableField(value = "product_stock")
	private Integer productStock;

	@TableField(value = "product_sales_volume")
	private Integer productSalesVolume;

	@TableField(value = "product_size")
	private String productSize;

	@TableField(value = "product_color")
	private String productColor;

	@TableField(value = "product_type")
	private String productType;

	@TableField(value = "product_emerge_site")
	private String productEmergeSite;

	@TableField(value = "product_rotation_img")
	private String productRotationImg;

	@TableField(value = "product_msg_img")
	private String productMsgImg;

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

	public String getProductMsg() {
		return productMsg;
	}

	public void setProductMsg(String productMsg) {
		this.productMsg = productMsg;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Double getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(Double productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public Integer getProductSalesVolume() {
		return productSalesVolume;
	}

	public void setProductSalesVolume(Integer productSalesVolume) {
		this.productSalesVolume = productSalesVolume;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductEmergeSite() {
		return productEmergeSite;
	}

	public void setProductEmergeSite(String productEmergeSite) {
		this.productEmergeSite = productEmergeSite;
	}

	public String getProductRotationImg() {
		return productRotationImg;
	}

	public void setProductRotationImg(String productRotationImg) {
		this.productRotationImg = productRotationImg;
	}

	public String getProductMsgImg() {
		return productMsgImg;
	}

	public void setProductMsgImg(String productMsgImg) {
		this.productMsgImg = productMsgImg;
	}

	public ProductDb() {

	}

	public ProductDb(Product product) {
		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.productMsg = product.getProductMsg();
		this.productPrice = product.getProductPrice();
		this.productSellingPrice = product.getProductSellingPrice();
		this.productStock = product.getProductStock();
		this.productSalesVolume = product.getProductSalesVolume();
		this.productSize = StringUtils.join(product.getProductSize(), ",");
		this.productColor = StringUtils.join(product.getProductColor(), ",");
		this.productType = product.getProductType();
		this.productEmergeSite = product.getProductEmergeSite();
		this.productRotationImg = StringUtils.join(product.getProductRotationImg(), ",");
		this.productMsgImg = StringUtils.join(product.getProductMsgImg(), ",");
	}

}

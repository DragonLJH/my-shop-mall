package com.dragon.demo.common;

public class Product {

	private Integer productId;

	private String productName;

	private String productMsg;

	private Double productPrice;

	private Double productSellingPrice;

	private Integer productStock;

	private Integer productSalesVolume;

	private String[] productSize;

	private String[] productColor;

	private String productType;

	private String productEmergeSite;

	private String[] productRotationImg;

	private String[] productMsgImg;

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

	public String[] getProductSize() {
		return productSize;
	}

	public void setProductSize(String[] productSize) {
		this.productSize = productSize;
	}

	public String[] getProductColor() {
		return productColor;
	}

	public void setProductColor(String[] productColor) {
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

	public String[] getProductRotationImg() {
		return productRotationImg;
	}

	public void setProductRotationImg(String[] productRotationImg) {
		this.productRotationImg = productRotationImg;
	}

	public String[] getProductMsgImg() {
		return productMsgImg;
	}

	public void setProductMsgImg(String[] productMsgImg) {
		this.productMsgImg = productMsgImg;
	}

	public Product() {

	}

	public Product(ProductDb productDb) {
		this.productId = productDb.getProductId();
		this.productName = productDb.getProductName();
		this.productMsg = productDb.getProductMsg();
		this.productPrice = productDb.getProductPrice();
		this.productSellingPrice = productDb.getProductSellingPrice();
		this.productStock = productDb.getProductStock();
		this.productSalesVolume = productDb.getProductSalesVolume();
		this.productSize = productDb.getProductSize().split(",");
		this.productColor = productDb.getProductColor().split(",");
		this.productType = productDb.getProductType();
		this.productEmergeSite = productDb.getProductEmergeSite();
		this.productRotationImg = productDb.getProductRotationImg().split(",");
		this.productMsgImg = productDb.getProductMsgImg().split(",");
	}

}

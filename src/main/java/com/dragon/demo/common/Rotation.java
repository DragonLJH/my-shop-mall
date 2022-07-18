package com.dragon.demo.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName(value = "rotation")
public class Rotation {

	@TableId(value = "rotation_id", type = IdType.AUTO)
	private Integer rotationId;

	@TableField(value = "rotation_img")
	private String rotationImg;

	@TableField(value = "product_id")
	private Integer productId;

	public Integer getRotationId() {
		return rotationId;
	}

	public void setRotationId(Integer rotationId) {
		this.rotationId = rotationId;
	}

	public String getRotationImg() {
		return rotationImg;
	}

	public void setRotationImg(String rotationImg) {
		this.rotationImg = rotationImg;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	

}

package com.dragon.demo.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "emerge")
public class Emerge {

	@TableId(value = "emerge_id", type = IdType.AUTO)
	private Integer emergeId;

	@TableField(value = "emerge_tag")
	private String emergeTag;

	public Integer getEmergeId() {
		return emergeId;
	}

	public void setEmergeId(Integer emergeId) {
		this.emergeId = emergeId;
	}

	public String getEmergeTag() {
		return emergeTag;
	}

	public void setEmergeTag(String emergeTag) {
		this.emergeTag = emergeTag;
	}

}

package com.dragon.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.demo.common.ProductDb;

public interface ProductDbService extends IService<ProductDb> {

	List<ProductDb> queryProductByEmerge(String emergeTag);

	ProductDb queryProductById(Integer productId);
	
	List<ProductDb> queryProductByProductMsg(String productMsg);

}

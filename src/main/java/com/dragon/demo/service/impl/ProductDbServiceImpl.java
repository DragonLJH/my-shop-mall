package com.dragon.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.ProductDb;
import com.dragon.demo.mapper.ProductDbMapper;

@Service("ProductDbService")
public class ProductDbServiceImpl extends ServiceImpl<ProductDbMapper, ProductDb> {
	public List<ProductDb> queryProductByEmerge(String emergeTag) {
		LambdaQueryWrapper<ProductDb> lambd = Wrappers.lambdaQuery(new ProductDb());
		lambd.like(ProductDb::getProductEmergeSite, emergeTag);
		return super.list(lambd);
	}

	public ProductDb queryProductById(Integer productId) {
		return super.getById(productId);
	}
	
	public List<ProductDb> queryProductByProductMsg(String productMsg) {
		LambdaQueryWrapper<ProductDb> lambd = Wrappers.lambdaQuery(new ProductDb());
		lambd.like(ProductDb::getProductMsg, productMsg);
		lambd.or();
		lambd.like(ProductDb::getProductName, productMsg);
		return super.list(lambd);
	}
	
	public List<ProductDb> queryProductByType(String productType){
		LambdaQueryWrapper<ProductDb> lambd = Wrappers.lambdaQuery(new ProductDb());
		lambd.eq(ProductDb::getProductType, productType);
		return super.list(lambd);
	}

}

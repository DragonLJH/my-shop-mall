package com.dragon.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.Shop;
import com.dragon.demo.mapper.ShopMapper;

@Service("ShopService")
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> {
	public List<Shop> queryShopByUserName(String userName) {
		LambdaQueryWrapper<Shop> lambd = Wrappers.lambdaQuery(new Shop());
		lambd.eq(Shop::getUserName, userName);
		return super.list(lambd);
	}
	public Shop queryShopByUAPACAS(Shop shop){
		LambdaQueryWrapper<Shop> lambd = Wrappers.lambdaQuery(new Shop());
		lambd.eq(Shop::getUserName, shop.getUserName());
		lambd.eq(Shop::getProductId, shop.getProductId());
		lambd.eq(Shop::getSelectColor, shop.getSelectColor());
		lambd.eq(Shop::getSelectSize, shop.getSelectSize());
		return super.getOne(lambd);
		
	}

	public boolean updateShopById(Shop shop) {
		return super.updateById(shop);
	}

	public boolean insertShop(Shop shop) {
		return super.save(shop);
	}

	public boolean deleteShopbyId(int shopId) {

		return super.removeById(shopId);
	}

}

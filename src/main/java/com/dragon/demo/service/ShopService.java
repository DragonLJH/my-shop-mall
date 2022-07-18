package com.dragon.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.demo.common.Shop;

public interface ShopService extends IService<Shop> {

	List<Shop> queryShopByUserName(String userName);

	boolean updateShopById(Shop shop);

	boolean insertShop(Shop shop);

	boolean deleteShopbyId(int shopId);

}

package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.Shop;
import com.dragon.demo.service.impl.ShopServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "购物车管理")
@RequestMapping("/shop")
@CrossOrigin("*")
@RestController
public class ShopController {
	@Autowired
	private ShopServiceImpl shopServiceImpl;

	@ApiOperation("获取所有购物车的商品信息----queryAllShop")
	@GetMapping("/queryAllShop")
	public List<Shop> queryAllShop() {
		return shopServiceImpl.list();

	}
	
	@ApiOperation("根据用户名获取购物车的商品----queryShopByUserName")
	@GetMapping("/queryShopByUserName")
	public List<Shop> queryShopByUserName(Shop shop) {
		return shopServiceImpl.queryShopByUserName(shop.getUserName());

	}

	@ApiOperation("根据用户名和产品ID以及颜色和尺寸获取购物车的商品----queryShopByUAPACAS")
	@GetMapping("/queryShopByUAPACAS")
	public Shop queryShopByUAPACAS(Shop shop) {
		return shopServiceImpl.queryShopByUAPACAS(shop);

	}

	@ApiOperation("更新购物车产品的数量----updateShopById")
	@PostMapping("/updateShopById")
	public boolean updateShopById(Shop shop) {
		return shopServiceImpl.updateShopById(shop);
	}

	@ApiOperation("添加购物信息----insertShop")
	@PostMapping("/insertShop")
	public boolean insertShop(Shop shop) {
		//根据用户名和产品ID以及颜色和尺寸获取购物车的商品
		Shop myShop = this.queryShopByUAPACAS(shop);
		//判断myShop是否为null，null的时候新增，获取到商品时根据传来的数量更新
		if (myShop instanceof Shop) {
			myShop.setSelectNum(myShop.getSelectNum() + shop.getSelectNum());
			return this.updateShopById(myShop);
		} else {
			return shopServiceImpl.insertShop(shop);
		}

	}

	@ApiOperation("删除购物信息----deleteShopbyId")
	@PostMapping("/deleteShopbyId")
	public boolean deleteShopbyId(Shop shop) {
		return shopServiceImpl.deleteShopbyId(shop.getShopId());

	}

}

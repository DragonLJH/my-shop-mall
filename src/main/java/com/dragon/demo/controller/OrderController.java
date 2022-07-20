package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.Emerge;
import com.dragon.demo.common.Order;
import com.dragon.demo.service.impl.OrderServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "订单管理")
@RequestMapping("/order")
@CrossOrigin("*")
@RestController
public class OrderController {
	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@ApiOperation("获取所有订单信息----queryAllOrder")
	@GetMapping("/queryAllOrder")
	public List<Order> queryAllOrder(){
		return orderServiceImpl.list();
	}
	
	@ApiOperation("获取指定用户的所有订单信息----queryAllOrderByUserName")
	@GetMapping("/queryAllOrderByUserName")
	public List<Order> queryAllOrderByUserName(Order order){
		return orderServiceImpl.queryAllOrderByUserName(order.getUserName());
	}
	


}

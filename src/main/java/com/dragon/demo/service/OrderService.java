package com.dragon.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.demo.common.Order;

public interface OrderService extends IService<Order> {

	List<Order> queryAllOrderByUserName(String userName);
	
}

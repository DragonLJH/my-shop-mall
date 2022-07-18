package com.dragon.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.Order;
import com.dragon.demo.mapper.OrderMapper;

@Service("OrderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>{
	
	public List<Order> queryAllOrderByUserName(String userName){
		LambdaQueryWrapper<Order> lambda = Wrappers.lambdaQuery(new Order());
		lambda.eq(Order::getUserName, userName);
		return super.list(lambda);
	}

}

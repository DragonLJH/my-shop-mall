package com.dragon.demo.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.User;
import com.dragon.demo.mapper.UserMapper;


@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User>{
	public User queryUserByUserName(User user) {
		LambdaQueryWrapper<User> lambda = Wrappers.lambdaQuery(new User());
		lambda.eq(User::getUserName, user.getUserName());
		return super.getOne(lambda);
	}
	
	
	
	

}

package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.User;
import com.dragon.demo.service.impl.UserServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户管理")
@RequestMapping("/user")
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@ApiOperation("查询所有用户信息----queryAllUser")
	@GetMapping("/queryAllUser")
	public List<User> queryAllUser() {
		return userServiceImpl.list();
	}

	@ApiOperation("根据用户名查询该用户----queryUserByUserName")
	@GetMapping("/queryUserByUserName")
	public boolean queryUserByUserName(User user) {
		boolean res = false;
		User dbUser = userServiceImpl.queryUserByUserName(user);
		if (dbUser != null && user.getUserPassword().contentEquals(dbUser.getUserPassword())) {
			res = true;
		}
		return res;
	}

	@ApiOperation("注册用户----insertUser")
	@PostMapping("/insertUser")
	public boolean insertUser(User user) {
		System.out.println(user.toString());
		boolean res = false;
		User dbUser = userServiceImpl.queryUserByUserName(user);
		if (dbUser == null) {
			res = userServiceImpl.save(user);
		}
		return res;

	}

}

package com.dragon.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.demo.common.User;

public interface UserService extends IService<User>{

	User queryUserByUserName(User user);
	
	
}

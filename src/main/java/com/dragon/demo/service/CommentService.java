package com.dragon.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragon.demo.common.Comment;

public interface CommentService extends IService<Comment>{
	List<Comment> queryCommentsByProductId(int productId); 
}

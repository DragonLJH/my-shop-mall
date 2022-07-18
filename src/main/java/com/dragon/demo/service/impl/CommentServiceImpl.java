package com.dragon.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.Comment;
import com.dragon.demo.mapper.CommentMapper;

@Service("CommentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> {

	public List<Comment> queryCommentsByProductId(int productId) {

		LambdaQueryWrapper<Comment> lambd = Wrappers.lambdaQuery(new Comment());
		lambd.eq(Comment::getProductId, productId);
		return super.list(lambd);

	}


}

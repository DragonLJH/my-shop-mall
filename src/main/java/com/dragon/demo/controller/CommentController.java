package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.Comment;
import com.dragon.demo.service.impl.CommentServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "评论管理")
@RequestMapping("/comment")
@CrossOrigin("*")
@RestController
public class CommentController {

	@Autowired
	private CommentServiceImpl commentServiceImpl;

	@ApiOperation("根据产品id获取该产品评论信息----queryCommentsByProductId")
	@GetMapping("/queryCommentsByProductId")
	public List<Comment> queryCommentsByProductId(Comment comment) {
		return commentServiceImpl.queryCommentsByProductId(comment.getProductId());
	}

	@ApiOperation("新增产品评论信息----insertComment")
	@PostMapping("/insertComment")
	public boolean insertComment(Comment comment) {
		return commentServiceImpl.save(comment);
	}

	@ApiOperation("根据id删除产品评论信息----deleteComment")
	@PostMapping("/deleteComment")
	public boolean deleteComment(Comment comment) {
		return commentServiceImpl.removeById(comment.getCommentId());
	}

	@ApiOperation("获取所有评论信息----queryAllCOmment")
	@PostMapping("/queryAllCOmment")
	public List<Comment> queryAllCOmment(){
		return commentServiceImpl.list();
	}

}

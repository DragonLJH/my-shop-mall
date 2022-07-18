package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.Type;
import com.dragon.demo.service.impl.TypeServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "类型管理")
@RequestMapping("/type")
@CrossOrigin("*")
@RestController
public class TypeController {
	@Autowired
	private TypeServiceImpl typeServiceImpl;

	@ApiOperation("查询所有类型----queryAllType")
	@GetMapping("/queryAllType")
	public List<Type> queryAllType() {
		return typeServiceImpl.list();

	}

	@ApiOperation("新增类型----insertType")
	@PostMapping("/insertType")
	public boolean insertType(Type type) {
		return typeServiceImpl.save(type);
	}

	@ApiOperation("根据id删除类型----deletdTypeById")
	@PostMapping("/deletdTypeById")
	public boolean deletdTypeById(Type type) {
		return typeServiceImpl.removeById(type.getTypeId());
	}

}

package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.common.Emerge;
import com.dragon.demo.service.impl.EmergeServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "分类管理")
@RequestMapping("/emerge")
@CrossOrigin("*")
@RestController
public class EmergeController {
	@Autowired
	private EmergeServiceImpl emergeServiceImpl;
	

	@ApiOperation("查询所有分类信息----queryAllEmerge")
	@GetMapping("/queryAllEmerge")
	public List<Emerge> queryAllEmerge(){
		return emergeServiceImpl.list();
	}

	@ApiOperation("新增分类信息----insertEmerge")
	@PostMapping("/insertEmerge")
	public boolean insertEmerge(Emerge emerge) {
		return emergeServiceImpl.save(emerge);
	}
	

	@ApiOperation("根据id删除分类信息----deleteEmergeById")
	@PostMapping("/deleteEmergeById")
	public boolean deleteEmergeById(Emerge emerge) {
		return emergeServiceImpl.removeById(emerge.getEmergeId());
	}
	

}

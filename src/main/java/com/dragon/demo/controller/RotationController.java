package com.dragon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dragon.demo.common.Common;
import com.dragon.demo.common.Rotation;
import com.dragon.demo.service.impl.RotationServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "轮播管理")
@RequestMapping("/rotation")
@CrossOrigin("*")
@RestController
public class RotationController {

	@Autowired
	private RotationServiceImpl rotationServiceImpl;

	@Autowired
	private Common common;

	@ApiOperation("获取所有轮播信息----queryAllRotation")
	@GetMapping("/queryAllRotation")
	public List<Rotation> queryAllRotation() {
		return rotationServiceImpl.queryAllRotation();
	}

	@ApiOperation("新增轮播信息----insertRotation")
	@PostMapping("/insertRotation")
	public boolean insertRotation(Rotation rotation) {
		return rotationServiceImpl.save(rotation);
	}

	@ApiOperation("根据id删除轮播信息----deleteRotationById")
	@PostMapping("/deleteRotationById")
	public boolean deleteRotationById(Rotation rotation) {
		return rotationServiceImpl.removeById(rotation.getProductId());
	}

	@ApiOperation("上传轮播图片----uploadRotationImg")
	@PostMapping("/uploadRotationImg")
	public String uploadRotationImg(@RequestParam("uploadRotationImg") MultipartFile file) throws Exception {
		String fileName = common.generateUniqueFileName(file.getOriginalFilename());
		String path = "/uploadRotationImg";
		common.uploadImg(file, fileName, path);

		return common.SERVERPATH + path + "/" + fileName;
	}

}

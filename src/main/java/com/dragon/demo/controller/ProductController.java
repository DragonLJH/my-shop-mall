package com.dragon.demo.controller;

import java.util.ArrayList;
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
import com.dragon.demo.common.Emerge;
import com.dragon.demo.common.Product;
import com.dragon.demo.common.ProductDb;
import com.dragon.demo.service.impl.ProductDbServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "商品管理")
@RequestMapping("/product")
@CrossOrigin("*")
@RestController
public class ProductController {
	@Autowired
	private ProductDbServiceImpl productDbServiceImpl;

	@Autowired
	private Common common;

	@ApiOperation("获取所有商品信息----queryAllProduct")
	@GetMapping("/queryAllProduct")
	public List<Product> queryAllProduct() {
		List<ProductDb> productDbList = productDbServiceImpl.list();
		List<Product> resProductList = new ArrayList<>();
		for (ProductDb item : productDbList) {
			Product newProduct = new Product(item);
			resProductList.add(newProduct);
		}
		return resProductList;
	}
	
	@ApiOperation("根据id删除商品信息----deleteProductById")
	@PostMapping("/deleteProductById")
	public boolean deleteProductById(Product product) {
		return productDbServiceImpl.removeById(product.getProductId());
	}
	
	@ApiOperation("根据商品定位查询对应的商品----queryProductByEmerge")
	@GetMapping("/queryProductByEmerge")
	public List<Product> queryProductByEmerge(Emerge emerge) {
		List<ProductDb> productDbList = productDbServiceImpl.queryProductByEmerge(emerge.getEmergeTag());
		List<Product> resProductList = new ArrayList<>();
		for (ProductDb item : productDbList) {
			Product newProduct = new Product(item);
			resProductList.add(newProduct);
		}
		return resProductList;
	}

	@ApiOperation("根据商品id查询对应的商品----queryProductById")
	@GetMapping("/queryProductById")
	public Product queryProductById(Product product) {
		ProductDb dbProduct = productDbServiceImpl.queryProductById(product.getProductId());
		Product newProduct = new Product(dbProduct);
		return newProduct;
	}

	@ApiOperation("根据查询信息获取对应的商品----queryProductByProductMsg")
	@GetMapping("/queryProductByProductMsg")
	public List<Product> queryProductByProductMsg(Product product) {
		List<ProductDb> productDbList = productDbServiceImpl.queryProductByProductMsg(product.getProductMsg());
		List<Product> resProductList = new ArrayList<>();
		for (ProductDb item : productDbList) {
			Product newProduct = new Product(item);
			resProductList.add(newProduct);
		}
		return resProductList;
	}

	@ApiOperation("根据类型获取对应的商品----queryProductByType")
	@GetMapping("/queryProductByType")
	public List<Product> queryProductByType(Product product) {
		List<ProductDb> productDbList = productDbServiceImpl.queryProductByType(product.getProductType());
		List<Product> resProductList = new ArrayList<>();
		for (ProductDb item : productDbList) {
			Product newProduct = new Product(item);
			resProductList.add(newProduct);
		}
		return resProductList;
	}

	@ApiOperation("上传商品图片----uploadProductRotationImg")
	@PostMapping("/uploadProductRotationImg")
	public List<String> uploadProductRotationImg(@RequestParam("uploadProductRotationImg") MultipartFile[] files)
			throws Exception {
		List<String> msg = new ArrayList<>();
		for (MultipartFile file : files) {
			String fileName = common.generateUniqueFileName(file.getOriginalFilename());
			String path = "/uploadProductRotationImg";
			common.uploadImg(file, fileName, path);	
			msg.add(common.SERVERPATH + path + "/" + fileName);
		}
		return msg;
	}

	@ApiOperation("上传商品详情图片----uploadProductMsgImg")
	@PostMapping("/uploadProductMsgImg")
	public List<String> uploadImgs(@RequestParam("uploadProductMsgImg") MultipartFile[] files) throws Exception {
		List<String> msg = new ArrayList<>();
		for (MultipartFile file : files) {
			String fileName = common.generateUniqueFileName(file.getOriginalFilename());
			String path = "/uploadProductMsgImg";
			common.uploadImg(file, fileName, path);	
			msg.add(common.SERVERPATH + path + "/" + fileName);
		}
		return msg;
	}
	

	@ApiOperation("新增商品----insertProduct")
	@PostMapping("/insertProduct")
	public boolean insertProduct(Product product) {
		ProductDb dbProduct = new ProductDb(product);
		return productDbServiceImpl.save(dbProduct);
	}

}

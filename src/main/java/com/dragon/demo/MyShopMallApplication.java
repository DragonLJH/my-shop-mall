package com.dragon.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import org.springframework.boot.web.servlet.ServletComponentScan;

@EnableOpenApi
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.dragon.demo.mapper")
public class MyShopMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShopMallApplication.class, args);
	}

}

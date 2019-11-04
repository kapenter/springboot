package com.jackson.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:/spring/spring-context.xml"})
@MapperScan(basePackages = "com.jackson.springboot.mapper")
public  class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class);
	}

}
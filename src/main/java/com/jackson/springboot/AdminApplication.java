package com.jackson.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:/spring/spring-context.xml"})
public  class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class);
	}

}
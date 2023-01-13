package com.superanime.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//(scanBasePackages={
//		"com.superanime.model.dao", "com.superanime.model.entity"})
public class SuperanimeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperanimeRestApplication.class, args);
	}
}

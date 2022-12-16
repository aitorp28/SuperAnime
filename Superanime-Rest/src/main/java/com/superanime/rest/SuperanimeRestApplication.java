package com.superanime.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(scanBasePackages={
//		"com.superanime.model.dao", "com.superanime.model.entity"})
public class SuperanimeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperanimeRestApplication.class, args);
	}

}

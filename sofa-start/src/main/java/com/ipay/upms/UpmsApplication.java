package com.ipay.upms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ipay.upms.common.dal.dao")
public class UpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpmsApplication.class, args);
	}
}

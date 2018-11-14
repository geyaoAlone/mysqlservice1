package com.geyao.mysqlservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan
@Configuration
public class MysqlserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlserviceApplication.class, args);
	}
}

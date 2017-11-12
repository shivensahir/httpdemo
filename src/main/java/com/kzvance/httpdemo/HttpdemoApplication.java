package com.kzvance.httpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class HttpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpdemoApplication.class, args);
	}
}

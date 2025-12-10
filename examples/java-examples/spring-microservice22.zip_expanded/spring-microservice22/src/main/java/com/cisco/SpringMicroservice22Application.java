package com.cisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringMicroservice22Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservice22Application.class, args);
	}

}

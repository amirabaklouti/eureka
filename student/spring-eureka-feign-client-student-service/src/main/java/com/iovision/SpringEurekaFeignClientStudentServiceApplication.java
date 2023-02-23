package com.iovision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringEurekaFeignClientStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaFeignClientStudentServiceApplication.class, args);
	}

}

package com.test.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.test") //使Feign可用
@ComponentScan(basePackages = "com.test")
public class ServiceaApplication
{

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);

	}



}

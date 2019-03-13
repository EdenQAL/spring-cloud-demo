package com.test.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableEurekaClient
public class ServiceaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);

	}
	@Value("${from}")  // 从对应的配置中心找到文件并把属性注入到value值中
	private String value;


	@RequestMapping("/hello")
	public String hello() {
		return "hello" + value;
	}
}

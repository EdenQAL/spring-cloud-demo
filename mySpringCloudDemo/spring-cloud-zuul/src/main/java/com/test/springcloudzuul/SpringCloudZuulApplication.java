package com.test.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine

@SpringCloudApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}

}

package com.example.zuulprojectcostservice4Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulProjectCostService4RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProjectCostService4RibbonApplication.class, args);
	}

}

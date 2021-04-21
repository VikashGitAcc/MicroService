package com.example.zuulprojectcostcalculationservice4Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.example.zuulprojectcostcalculationservice4Ribbon")
public class ZuulProjectCostCalculationService4RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProjectCostCalculationService4RibbonApplication.class, args);
	}

}

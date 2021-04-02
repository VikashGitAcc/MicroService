package com.example.projectcostcalculationservice4Feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.projectcostcalculationservice4Feign")
public class ProjectCostCalculationService4FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCostCalculationService4FeignApplication.class, args);
	}

}

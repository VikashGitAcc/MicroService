package com.example.projectcostcalculationservice4Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.example.projectcostcalculationservice4Ribbon")
public class ProjectCostCalculationService4RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCostCalculationService4RibbonApplication.class, args);
	}

}

package com.example.projectcostservice4Feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjectCostService4FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCostService4FeignApplication.class, args);
	}

}

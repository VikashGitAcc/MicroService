package com.example.projectcostcalculationservice4Feign.bean;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="project-cost-service", url="localhost:7070")
public interface ProjectCostCalculationProxy {
	
	@GetMapping("proj-cost/projectID/{projectID}")
	public ProjectCostCalculation getFinalCost( @PathVariable int projectID);

}

package com.example.projectcostcalculationservice4Ribbon.bean;



import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="project-cost-service", url="localhost:7070")
@FeignClient(name="project-cost-service")
@RibbonClient(name="project-cost-service")
public interface ProjectCostCalculationProxy {
	
	@GetMapping("proj-cost/projectID/{projectID}")
	public ProjectCostCalculation getFinalCost( @PathVariable int projectID);

}

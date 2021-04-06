package com.example.eurekanamingclientCallingAppWithRibbon.bean;



import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="project-cost-service", url="localhost:7070")
@FeignClient(name="eureka-naming-clientWithRibbon")
@RibbonClient(name="eureka-naming-clientWithRibbon")
public interface ProjectCostCalculationProxy {
	
	@GetMapping("proj-cost/projectID/{projectID}")
	public ProjectCostCalculation getFinalCost( @PathVariable int projectID);

}

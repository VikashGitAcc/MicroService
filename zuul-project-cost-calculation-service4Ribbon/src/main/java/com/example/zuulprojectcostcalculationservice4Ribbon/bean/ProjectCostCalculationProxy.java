package com.example.zuulprojectcostcalculationservice4Ribbon.bean;



import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="project-cost-service", url="localhost:7070")
//@FeignClient(name="zuul-project-cost-service4Ribbon")
@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name="zuul-project-cost-service4Ribbon")
public interface ProjectCostCalculationProxy {
	
	@GetMapping("zuul-project-cost-service4Ribbon/proj-cost/projectID/{projectID}")
	public ProjectCostCalculation getFinalCost( @PathVariable int projectID);

}

package com.example.sleuthprojectcost.calculationservice4Ribbon.bean.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.sleuthprojectcost.calculationservice4Ribbon.bean.ProjectCostCalculation;
import com.example.sleuthprojectcost.calculationservice4Ribbon.bean.ProjectCostCalculationProxy;
import com.example.sleuthprojectcost.calculationservice4Ribbon.bean.ResorceCost;







@RestController
public class ProjectCostCalculationController {
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ResorceCost resorceCost;
	
	@Autowired
	private ResorceCostRepository resorceCostRepository;
	
	@Autowired
	private ProjectCostCalculationProxy projectCostCalculationProxy;
	
	@GetMapping("proj-cost/projectID/{projectID}/resourceID/{resourceID}")
	public ProjectCostCalculation getFinalProjCost(@PathVariable int projectID, @PathVariable int resourceID) {
		
		Optional<ResorceCost> resorceCost123 = resorceCostRepository.findById(resourceID);
		resorceCost = resorceCost123.get();
		int resoursceCost = resorceCost.getResCost();
		
		Map<String, Integer> _map = new HashMap<String, Integer>();
		_map.put("projectID", projectID);
		
		ResponseEntity<ProjectCostCalculation> responseEntity=
				new RestTemplate().getForEntity("http://localhost:7070/proj-cost/projectID/102", 
				ProjectCostCalculation.class, 
				_map);
		
		ProjectCostCalculation projectCostCalculationResponse = responseEntity.getBody();
	
		System.out.println("333333333333333333333333333333333333333333");
		logger.info("{}", projectCostCalculationResponse);
		System.out.print("444444444444444444444444444444444444444444444");
	
	  return new ProjectCostCalculation(projectCostCalculationResponse.getId(), projectCostCalculationResponse.getProjLang(),
			  projectCostCalculationResponse.getProjMonth(), projectCostCalculationResponse.getProjResource(), 
			  resoursceCost*projectCostCalculationResponse.getProjMonth()*projectCostCalculationResponse.getProjResource());
		
	}
	
	@GetMapping("proj-cost-feign/projectID/{projectID}/resourceID/{resourceID}")
	public ProjectCostCalculation getFinalProjCostFeign(@PathVariable int projectID, @PathVariable int resourceID) {
		
		Optional<ResorceCost> resorceCost123 = resorceCostRepository.findById(resourceID);
		resorceCost = resorceCost123.get();
		int resoursceCost = resorceCost.getResCost();
		
		/*Map<String, Integer> _map = new HashMap<String, Integer>();
		_map.put("projectID", projectID);
		
		ResponseEntity<ProjectCostCalculation> responseEntity=
				new RestTemplate().getForEntity("http://localhost:7070/proj-cost/projectID/102", 
				ProjectCostCalculation.class, 
				_map);*/
		
		ProjectCostCalculation projectCostCalculationResponse =projectCostCalculationProxy.getFinalCost(projectID);
				
		logger.info("{}", projectCostCalculationResponse);
				
			//	responseEntity.getBody();
	
	
	  return new ProjectCostCalculation(projectCostCalculationResponse.getId(), projectCostCalculationResponse.getProjLang(),
			  projectCostCalculationResponse.getProjMonth(), projectCostCalculationResponse.getProjResource(), 
			  resoursceCost*projectCostCalculationResponse.getProjMonth()*projectCostCalculationResponse.getProjResource());
		
	}

}

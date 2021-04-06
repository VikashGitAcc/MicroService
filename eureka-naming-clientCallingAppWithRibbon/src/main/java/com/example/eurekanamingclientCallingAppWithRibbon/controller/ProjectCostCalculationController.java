package com.example.eurekanamingclientCallingAppWithRibbon.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.eurekanamingclientCallingAppWithRibbon.bean.ProjectCostCalculation;
import com.example.eurekanamingclientCallingAppWithRibbon.bean.ProjectCostCalculationProxy;
import com.example.eurekanamingclientCallingAppWithRibbon.bean.ResorceCost;





@RestController
public class ProjectCostCalculationController {
	
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
				
				
			//	responseEntity.getBody();
	
	
	  return new ProjectCostCalculation(projectCostCalculationResponse.getId(), projectCostCalculationResponse.getProjLang(),
			  projectCostCalculationResponse.getProjMonth(), projectCostCalculationResponse.getProjResource(), 
			  resoursceCost*projectCostCalculationResponse.getProjMonth()*projectCostCalculationResponse.getProjResource());
		
	}

}

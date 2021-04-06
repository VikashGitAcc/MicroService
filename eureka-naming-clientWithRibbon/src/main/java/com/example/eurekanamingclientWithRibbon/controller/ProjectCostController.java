package com.example.eurekanamingclientWithRibbon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.eurekanamingclientWithRibbon.model.ProjectCost;





@RestController
public class ProjectCostController {
	
	
	@Autowired
	private ProjectCost projectCost;
	
	
	@Autowired
	private ProjectCostRepositoyu projectCostRepositoyu;
	
	
	@GetMapping("proj-cost/projectID/{projectID}")
	public ProjectCost getFinalCost( @PathVariable int projectID) {
		//int id, String projLang, int projMonth, int projResource
		
		Optional<ProjectCost> projectCost123  = projectCostRepositoyu.findById(projectID);
		
				projectCost = projectCost123.get();	
				
				return  projectCost;
	}
	

	
}

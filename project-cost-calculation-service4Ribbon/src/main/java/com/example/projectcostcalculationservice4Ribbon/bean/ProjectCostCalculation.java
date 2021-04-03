package com.example.projectcostcalculationservice4Ribbon.bean;




public class ProjectCostCalculation {
	
	
	private int id;
	private String projLang;
	private int projMonth;
	private int projResource;
	private int projFinalCost;
	
	public ProjectCostCalculation() {
		
	}
	
	
	public ProjectCostCalculation(int id, String projLang, int projMonth, int projResource, int projFinalCost) {
		super();
		this.id = id;
		this.projLang = projLang;
		this.projMonth = projMonth;
		this.projResource = projResource;
		this.projFinalCost = projFinalCost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProjLang() {
		return projLang;
	}


	public void setProjLang(String projLang) {
		this.projLang = projLang;
	}


	public int getProjMonth() {
		return projMonth;
	}


	public void setProjMonth(int projMonth) {
		this.projMonth = projMonth;
	}


	public int getProjResource() {
		return projResource;
	}


	public void setProjResource(int projResource) {
		this.projResource = projResource;
	}


	public int getProjFinalCost() {
		return projFinalCost;
	}


	public void setProjFinalCost(int projFinalCost) {
		this.projFinalCost = projFinalCost;
	}
	
	
	
	
}

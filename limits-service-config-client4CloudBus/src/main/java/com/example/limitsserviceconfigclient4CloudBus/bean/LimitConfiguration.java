package com.example.limitsserviceconfigclient4CloudBus.bean;

public class LimitConfiguration {
	
	public int maximum;
	public int minimum;
	
	
	
	
	protected LimitConfiguration() {
	
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}
		

}

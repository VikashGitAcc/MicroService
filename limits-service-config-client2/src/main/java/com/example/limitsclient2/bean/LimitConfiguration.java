package com.example.limitsclient2.bean;

public class LimitConfiguration {
	
	public int maximum;
	public int minimum;
	public String name;
	
	
	
	
	protected LimitConfiguration() {
	
	}
	public LimitConfiguration(int maximum, int minimum, String name) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		this.name=name;
	}
	public int getMaximum() {
		return maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}
		
	
	public String getName() {
		return name;
	}

}

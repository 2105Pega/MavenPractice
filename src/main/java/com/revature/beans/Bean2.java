package com.revature.beans;

public class Bean2 {
	
	private String name;
	
	public Bean2(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "what's up, "+name+"?";
	}

}

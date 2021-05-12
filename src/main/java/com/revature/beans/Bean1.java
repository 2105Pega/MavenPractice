package com.revature.beans;

public class Bean1 {
	private String color;
	private int floors;
	private String city;
	
	public Bean1(String color, int floors, String city) {
		this.color=color;
		this.floors=floors;
		this.city=city;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Your house is "+color+" and has "+floors+" floors and is in "+city+".";
	}

}

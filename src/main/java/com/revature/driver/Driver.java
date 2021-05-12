package com.revature.driver;

import com.revature.beans.*;

public class Driver {
	
	public static void main (String[]args) {
		
		
		Bean1 myHouse = new Bean1("white",2,"Seattle");
		Bean1 yourHouse = new Bean1("red",3,"Denver");
		System.out.println(myHouse.toString());
		System.out.println(yourHouse.toString());
		
		Bean2 matt = new Bean2("Matt");
		Bean2 gabriel = new Bean2("Gabriel");
		System.out.println(matt.toString());
		System.out.println(gabriel.toString());
		
		
		System.out.println("Matt is great.");
	}

}

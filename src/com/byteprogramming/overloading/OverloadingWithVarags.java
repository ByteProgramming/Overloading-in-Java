package com.byteprogramming.overloading;

public class OverloadingWithVarags {
	
	public void calculateArea(double ...i) {
		
		for(double x : i)
		System.out.println("Area int calculate : " + x);
	}
	
	public void calculateArea(int i, int ...j) {
		
		for(int x : j)
		System.out.println("Area int: " + x);
		
		System.out.println("Area int " + i);
	}
	
	public static void main(String[] args) {

		OverloadingWithVarags obj = new OverloadingWithVarags();
		obj.calculateArea(10);
		obj.calculateArea(20);
		
	}

}

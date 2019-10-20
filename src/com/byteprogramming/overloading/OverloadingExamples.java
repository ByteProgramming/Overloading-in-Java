package com.byteprogramming.overloading;

public class OverloadingExamples {
	
	public void calculateArea(double i, int j) {
		System.out.println("Area : " + i*j);
	}
	
	public void calculateArea(int l, double b) {
		System.out.println("Area : " + l*b);
	}
	
	public static void main(String[] args) {
		
		OverloadingExamples obj = new OverloadingExamples();
		obj.calculateArea(10.5, 10);
		obj.calculateArea(10, 20.3);
		
	}
	
}

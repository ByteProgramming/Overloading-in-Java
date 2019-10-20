package com.byteprogramming.overloading;

public class OverloadingWithAutoboxingAndUnboxing {
	
	//Autoboxing : int->Integer

	//Unboxing  : Integer->int
	
	public void calculateArea(double i) {
		System.out.println("Area Double : " + i);
	}
	
	public void calculateArea(String a) {
		System.out.println("Area String: " + a);
	}
	
	public static void main(String[] args) {
		
		OverloadingWithAutoboxingAndUnboxing obj = new OverloadingWithAutoboxingAndUnboxing();
		obj.calculateArea(new Double(10.5));
		obj.calculateArea("abc");
		
	}

}
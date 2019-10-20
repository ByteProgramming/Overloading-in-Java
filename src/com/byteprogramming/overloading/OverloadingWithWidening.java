package com.byteprogramming.overloading;

public class OverloadingWithWidening {

	//Widening : byte  -> char -> short  -> int  -> long -> float -> double> 
	
	public void calculateArea(double i) {
		System.out.println("Area Double : " + i);
	}
	
	public void calculateArea(String a) {
		System.out.println("Area String: " + a);
	}
	
	public static void main(String[] args) {
		OverloadingWithWidening obj = new OverloadingWithWidening();
		obj.calculateArea(10);
		obj.calculateArea("Abc");

	}

}

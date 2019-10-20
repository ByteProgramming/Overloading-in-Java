package com.byteprogramming.overloading;

public class OverloadingWithNull {

	public void calculateArea(int i) {
		System.out.println("Area Double : " + i);
	}
	
	public void calculateArea(String a) {
		System.out.println("Area String: " + a);
	}
	
	
	public static void main(String[] args) {
		OverloadingWithNull obj = new OverloadingWithNull();
		obj.calculateArea(null);
		obj.calculateArea("ABC");

	}

}

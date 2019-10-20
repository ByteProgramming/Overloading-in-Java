package com.byteprogramming.overloading;

public class OverloadingWithConstructor {

	public OverloadingWithConstructor() {
		super();
		System.out.println("Inside no-arg constructor");
	}
	
	public OverloadingWithConstructor(int i) {
		super();
		System.out.println("Inside no-arg constructor, value" + i);
	}

	public static void main(String[] args) {
	OverloadingWithConstructor obj = new OverloadingWithConstructor();
	OverloadingWithConstructor paramObj = new OverloadingWithConstructor(10);

	}

}

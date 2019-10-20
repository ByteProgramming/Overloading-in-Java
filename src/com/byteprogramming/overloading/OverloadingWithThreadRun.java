package com.byteprogramming.overloading;

public class OverloadingWithThreadRun extends Thread {

	public void run() {
		
		System.out.println("Inside run");
	}
	
	public void run(int i) {
		System.out.println("Insde run, value : " + i);
	}
	
	public static void main(String[] args) {
	
       OverloadingWithThreadRun obj = new OverloadingWithThreadRun();
       obj.start();
       obj.run(1);
	}

}

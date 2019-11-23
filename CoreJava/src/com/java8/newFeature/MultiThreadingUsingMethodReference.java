package com.java8.newFeature;

public class MultiThreadingUsingMethodReference {
	
	public void m1() {
		for(int i=0; i<10; i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		MultiThreadingUsingMethodReference t = new MultiThreadingUsingMethodReference();
		Runnable r = t ::m1;
		Thread t1 = new Thread(r);
		t1.start();
		for(int j=0; j<10; j++) {
			System.out.println("Main thread");
		}

	}

}

package com.java8.newFeature;

class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread : "+i);
		}
	}
}

public class ThreadExp {

	public static void main(String[] args) {
		Runnable r = new MyRunnable1();
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread : "+i);
		}
	}

}

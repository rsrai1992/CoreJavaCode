package com.java8.newFeature;

public class AnonymousInnerClassvsLambdaExp {

	public static void main(String[] args) {
		// using inner class
		/*
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Inner class run method.");
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread : "+i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread Thread : "+i);
		} */

		//USing lambda expression
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread : "+i);
			}
		};
		/*
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread Thread : "+i);
		} */
		Thread t = new Thread(()->{
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread : "+i);
			}
		});
		t.start();
	}

}

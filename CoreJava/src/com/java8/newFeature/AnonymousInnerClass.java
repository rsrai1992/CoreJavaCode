package com.java8.newFeature;

public class AnonymousInnerClass {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is called");
				for(int i=0; i<10; i++) {
					System.out.println("Child thread...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main thread..");
			Thread.sleep(200);
		}
	}

}

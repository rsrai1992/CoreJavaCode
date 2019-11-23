package com.java8.newFeature;

public class ThreadWithLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Child thread...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
	Thread t = new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread..");
		Thread.sleep(300);
	}
	}

}

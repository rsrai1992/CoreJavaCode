package com.java8.newFeature;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	   Runnable r = new MyRunnable();
	   Thread t = new Thread(r);
	   t.start();
	   for(int j=0; j<10; j++) {
		   System.out.println("Main Thread...");
		   Thread.sleep(500);
	   }
	}

}

package com.multiThreading.example;

public class PrintSequentialNumberUsingMultithreading {

	public static void main(String[] args) {
		Runnable r1 = ()->{
			for(int i=1; i<=10; i=i+2) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = ()->{
			for(int i=2; i<=10; i=i+2) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}

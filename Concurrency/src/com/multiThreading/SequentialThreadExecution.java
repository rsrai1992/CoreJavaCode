package com.multiThreading;

class MySequentialThread implements Runnable{

	@Override
	public void run() {
		//for(int i=0; i<5; i++) {
		System.out.println("Executing thread "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" finished execution.");
		//}
	}
	
}

public class SequentialThreadExecution {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new MySequentialThread();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	
		
	}

}

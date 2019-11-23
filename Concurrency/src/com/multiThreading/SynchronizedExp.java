package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter{
	volatile int count = 0;
	public void increment() {
		count = count + 1;
	}
	
	public int getCount() {
		return count;
	}
}

public class SynchronizedExp {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=0; i<1000; i++) {
			executorService.submit(()->c.increment());
		}
		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);
		System.out.println("Counter value - "+c.getCount());

	}

}

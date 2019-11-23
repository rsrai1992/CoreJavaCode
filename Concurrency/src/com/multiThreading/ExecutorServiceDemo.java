package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerExe implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		//ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++) {
			executorService.submit(new WorkerExe());
		}
		
	}

}

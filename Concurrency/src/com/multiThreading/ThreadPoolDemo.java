package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread1 implements Runnable{
	
	private String command;
	
	public WorkerThread1(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
	}

	private void processCommand() {
		 try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public String toString() {
		return this.command;
	}	
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++) {
			Runnable r = new WorkerThread1(""+i);
			executor.execute(r);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}

}

package com.threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMultipleExample {

	public static void main(String[] args) {
System.out.println("Inside : "+ Thread.currentThread().getName());
		
		System.out.println("Creating Executor Service with thread pool size 3........");
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		System.out.println("Creating a runnable.......");
		Runnable task1 = () ->{
			System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
		};
		
		Runnable task2 = () -> {
            System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(7);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        
        Runnable task3 = () -> {
            System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(9);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
		
        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        
        System.out.println("Shutting down the executor");
        executorService.shutdown();

	}

}

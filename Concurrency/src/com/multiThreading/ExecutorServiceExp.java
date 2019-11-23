package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExp {

	public static void main(String[] args) {
		System.out.println("Inside : "+Thread.currentThread().getName());
		System.out.println("Creating executor service - ");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		System.out.println("Creating runnable - ");
		Runnable r = ()->{
			System.out.println("Inside : "+Thread.currentThread().getName());
		};
		System.out.println("Submitting the task to executor service which is kind of runnable");
		executorService.submit(r);
		System.out.println("Shutting down executor service");
		executorService.shutdown();

	}

}

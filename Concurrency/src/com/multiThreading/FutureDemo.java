package com.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<String> callable = ()->{
			System.out.println("Entered inside callable");
			return "Hello from callable";
		};
		System.out.println("Submitting task to callable.");
		Future<String> future= executorService.submit(callable);
		System.out.println("Retriving something from result");
		String r = future.get();
		System.out.println("Result : "+r);
		executorService.shutdown();
	}

}

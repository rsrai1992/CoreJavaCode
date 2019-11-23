package com.java8.oreilly;

import java.util.concurrent.Callable;

public class Runnables {
	
	public void methodAcceptingRunnable(Runnable r) {
		
	}
	
	public void methodAcceptingCallable(Callable c) {
		
	}
	
	public static void main(String[] args) {
		Runnable runnable = ()->System.out.println("Hello, Lambda...");
		new Runnables().methodAcceptingRunnable(runnable);
		
		new Runnables().methodAcceptingRunnable(()->{
			System.out.println("Complex lambda..");
		});
		
		Callable callable = ()->"Hello, Callable..";
		new Runnables().methodAcceptingCallable(()->{
			return "Complex Callables..";
		});
	}
	
	interface Tradable<Trade>{
		boolean check(Trade t);
	};
	
}

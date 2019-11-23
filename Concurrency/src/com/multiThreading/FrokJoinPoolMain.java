package com.multiThreading;

import java.util.concurrent.ForkJoinPool;

public class FrokJoinPoolMain {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(1000);
		pool.invoke(simpleRecursiveAction);
	}

}

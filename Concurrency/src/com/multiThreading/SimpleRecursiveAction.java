package com.multiThreading;

import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction{
	
	private int simulateWork;
	
	public SimpleRecursiveAction(int simulateWork) {
		this.simulateWork = simulateWork;
	}

	@Override
	protected void compute() {
		if(simulateWork>100) {
			System.out.println("Parallel execution and split tasks... "+simulateWork);
			SimpleRecursiveAction simpleRecursiveAction1 = new SimpleRecursiveAction(simulateWork/2);
			SimpleRecursiveAction simpleRecursiveAction2 = new SimpleRecursiveAction(simulateWork/2);
			
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
		}else {
			System.out.println("No need of parallel execution, sequential algorithum is file "+simulateWork );
		}
		
	}


}

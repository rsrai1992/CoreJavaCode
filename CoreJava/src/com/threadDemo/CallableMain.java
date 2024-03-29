package com.threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableMain {

	public static void main(String[] args) {
		 // FutureTask is a concrete class that 
	    // implements both Runnable and Future 
	    FutureTask[] randomNumberTasks = new FutureTask[5]; 
	  
	    for (int i = 0; i < 5; i++) 
	    { 
	      Callable callable = (Callable) new CallableDemo(); 
	  
	      // Create the FutureTask with Callable 
	      randomNumberTasks[i] = new FutureTask(callable); 
	  
	      // As it implements Runnable, create Thread 
	      // with FutureTask 
	      Thread t = new Thread(randomNumberTasks[i]); 
	      t.start(); 
	    } 
	  
	    for (int i = 0; i < 5; i++) 
	    { 
	      // As it implements Future, we can call get() 
	      try {
			System.out.println(randomNumberTasks[i].get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  
	      // This method blocks till the result is obtained 
	      // The get method can throw checked exceptions 
	      // like when it is interrupted. This is the reason 
	      // for adding the throws clause to main 
	    } 

	}

}

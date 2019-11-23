package com.threadDemo;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableDemo implements Callable {
	
	public Object call() throws Exception{
		
		Random generator = new Random(); 
		int randomNumber = generator.nextInt(5); 
		Thread.sleep(randomNumber * 1000); 
        return new Integer(randomNumber);
		
	}

}

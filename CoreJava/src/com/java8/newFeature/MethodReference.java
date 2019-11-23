package com.java8.newFeature;

interface MethodRefernceInterf{
	public void m1();
}

public class MethodReference {
	
	public static void m2() {
		System.out.println("Method reference - m2");
	}

	public static void main(String[] args) {
		/* -- Using lambda expression example
		MethodRefernceInterf i = ()->{
			System.out.println("Lambda expression.");
		};
      i.m1(); */
		// Using method reference
		MethodRefernceInterf i = MethodReference::m2;
		i.m1();
	}
}

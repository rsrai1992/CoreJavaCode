package com.user.interfaceDemo;

public class Calculator implements Compute {
	public void add() {
		int a,b,c;
		a = 10;
		b = 20;
		c = a+b;
		System.out.println("Addition :"+c);
	}
	
	public void sub() {
		int a,b,c;
		a = 10;
		b = 20;
		c = b - a;
		System.out.println("Substraction :"+c);
	}
	
	public void mult() {
		int a,b,c;
		a = 10;
		b = 20;
		c = a*b;
		System.out.println("Multiplication :"+c);
	}

}

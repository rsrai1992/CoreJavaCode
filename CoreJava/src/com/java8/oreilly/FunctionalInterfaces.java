package com.java8.oreilly;

public class FunctionalInterfaces {
	
	@FunctionalInterface
	interface Operate{
		int openat(int i, int j);
	};
	
	public int applyOperator(int i, int j, Operate operate) {
		return operate.openat(i, j);
	}

	public static void main(String[] args) {
		FunctionalInterfaces op = new FunctionalInterfaces();
		
		int ans = op.applyOperator(3, 4, (p,q)-> p*q);
		System.out.println("Multiplication : "+ans);
		
		ans = op.applyOperator(3, 4, (p,q)-> p/q);
		System.out.println("Division : "+ans);
		
		ans = op.applyOperator(3, 4, (p,q)-> p+q);
		System.out.println("Addition : "+ans);
		
		ans = op.applyOperator(3, 4, (p,q)-> p-q);
		System.out.println("Substraction : "+ans);
		
		ans = op.applyOperator(4, 3, (p,q)-> p%q);
		System.out.println("Modular : "+ans);

	}

}

package com.java8.newFeature;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void m1(Predicate<Integer>P, int[]x) {
		for(int i:x) {
			if(P.test(i))
				System.out.println(i);
		}	
	}

	public static void main(String[] args) {
		int[] x = {0,5,10,15,25,30};
		Predicate<Integer> P1 = i->i>10;
		Predicate<Integer> P2 = i->i%2==0;
		System.out.println("The numbers greater than 10 : ");
		m1(P1,x);
		System.out.println("The numbers less than 10 : ");
		m1(P1.negate(),x);
		System.out.println("The numbers greater than 10 and even : ");
		m1(P1.and(P2),x);
		System.out.println("The numbers greater than 10 OR even : ");
		m1(P1.or(P2),x);
	}

}

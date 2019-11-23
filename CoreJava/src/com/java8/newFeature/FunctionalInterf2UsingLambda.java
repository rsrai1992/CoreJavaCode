package com.java8.newFeature;

@FunctionalInterface
interface Interf4{
	public void m11();
}

public class FunctionalInterf2UsingLambda {

	public static void main(String[] args) {
		Interf4 i = ()->System.out.println("m1() method implementation.");
		i.m11();
	}

}

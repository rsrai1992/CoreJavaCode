package com.java8.newFeature;

interface InterfDefault{
	default void m1() {
		System.out.println("Default method.");
	}
}

public class DefaultMethodsDemo implements InterfDefault {
	
	public void m1() {
		System.out.println("My own implementation.");
	}

	public static void main(String[] args) {
		DefaultMethodsDemo d = new DefaultMethodsDemo();
		d.m1();
	}

}

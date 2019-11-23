package com.java8.newFeature;

@FunctionalInterface
public interface PInterf {
	public void m1();
}

@FunctionalInterface
interface C extends PInterf{
	public void m1();
}
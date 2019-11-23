package com.interview.questions;

public final class ImmutableClass {
	
    int a;
	final Integer b;
	public ImmutableClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
}

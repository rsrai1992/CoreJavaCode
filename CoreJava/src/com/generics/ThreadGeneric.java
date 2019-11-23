package com.generics;

import java.util.ArrayList;

class Test1<T extends Runnable> {

	public void m1(ArrayList<?> al) {
		// al.add(10.5);
		al.add(null);
	}

	public void m2(ArrayList<? extends Runnable> al1) {

	}

	public void m3(ArrayList<? super Runnable> al2) {

	}

	public void m4(ArrayList<String> l) {

	}

	/*
	public void m4(ArrayList<Integer> l11) {
     Erasure of method m4(ArrayList<Integer>) is the same as another method in type Test1<T>
	}
    */
}

public class ThreadGeneric {

	public static void main(String[] args) {
		Test1<Runnable> t1 = new Test1<Runnable>();
		ArrayList<?> l = new ArrayList<String>();
		ArrayList<? extends Number> l1 = new ArrayList<Integer>();
		// ArrayList<? extends Number> l2 = new ArrayList<String>();
		// Test1<Integer> t1 = new Test1<Integer>();

		ArrayList<? super Number> l2 = new ArrayList<Object>();
		// ArrayList<?> l = new ArrayList<?>();

		ArrayList l3 = new ArrayList<String>();
		l3.add(10);
		l3.add(true);

	}

}

package com.generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsPolymarphism {
	
	//ArrayList<String> al = new ArrayList<String>();
	// ArrayList<Object> al1 = new ArrayList<String>();
	/* Polymorphism concept applicable only for base type not for parameter type */
	
	// ArrayList<int> al2 = new ArrayList<int>();
	/* Only class or interface is allowed as type parameter but not primitives */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("durga");
		//al.add(new Integer(10));
	}



}

package com.collection.example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		System.out.println("Enumeration : "+e.getClass().getName());
		System.out.println("Iterator : "+itr.getClass().getName());
		System.out.println("ListIterator : "+litr.getClass().getName());
	}

}

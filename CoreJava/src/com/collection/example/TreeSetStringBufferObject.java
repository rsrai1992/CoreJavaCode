package com.collection.example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBufferObject {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator1());
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("L"));
		System.out.println(ts);
	}

}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
}

package com.collection.example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringAndStringBuffer {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator2());
		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add("BB");
		ts.add(new StringBuffer("AA"));
		ts.add("XX");
		ts.add("ABC");
		ts.add("A");

		System.out.println(ts);
	}
}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1>l2)
			return -1;
		else if(l1<l2)
			return 1;
		else
			return s1.compareTo(s2);			
	}	
}
// [ABC, ABC, BB, AA, XX, A, A] 
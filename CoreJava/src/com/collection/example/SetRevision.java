package com.collection.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class SetRevision {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new StringComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("L"));
		t.add("c");
		t.add(new StringBuffer("Z"));
		t.add("b");
		
			
		System.out.println(t);

	}

}

class StringComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

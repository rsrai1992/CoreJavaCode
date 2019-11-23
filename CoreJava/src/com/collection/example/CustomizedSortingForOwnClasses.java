package com.collection.example;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	String name;
	int id;
	
	public Employee(String name,int id) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object obj) {
		int e1 = id;
		Employee e = (Employee) obj;
		int e2 = e.id;
		if(e1>e2)
			return 1;
		else if(e1<e2)
			return -1;
		else 
			return 0;
	}
	
	}
class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}

public class CustomizedSortingForOwnClasses {

	public static void main(String[] args) {
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("balaiah",200);
		Employee e3 = new Employee("chiru",50);
		Employee e4 = new Employee("venki",150);
		Employee e5 = new Employee("nag",100);
		
		TreeSet t = new TreeSet(new MyComparator3());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);

	}

}

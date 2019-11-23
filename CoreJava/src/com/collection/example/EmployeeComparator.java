package com.collection.example;

import java.util.Comparator;
import java.util.TreeSet;

class Employeets implements Comparable{
	int rollno;
	String name;
	
	public Employeets(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + "]";
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int compareTo(Object obj) {
		int rollno1 = this.rollno;
		Employeets e = (Employeets)obj;
		int rollno2 = e.rollno;
		if(rollno1<rollno2)
			return -1;
		else if(rollno1>rollno2)
			return 1;
		else 
			return 0;
	}
	
}

class EmpComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employeets e1 = (Employeets) o1;
		Employeets e2 = (Employeets) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s2.compareTo(s1);
	}
	
}

public class EmployeeComparator {

	public static void main(String[] args) {
		Employeets e4 = new Employeets(4,"ram");
		Employeets e1 = new Employeets(1,"abc");
		Employeets e5 = new Employeets(5,"xyz");
		Employeets e2 = new Employeets(2,"bcd");
		Employeets e3 = new Employeets(3,"mno");
		TreeSet ts = new TreeSet();
		ts.add(e4);
		ts.add(e1);
		ts.add(e5);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);
		
		Employeets e42 = new Employeets(4,"ram");
		Employeets e12 = new Employeets(1,"abc");
		Employeets e52 = new Employeets(5,"xyz");
		Employeets e22 = new Employeets(2,"bcd");
		Employeets e32 = new Employeets(3,"mno");
		TreeSet ts1 = new TreeSet(new EmpComparator());
		ts1.add(e42);
		ts1.add(e12);
		ts1.add(e52);
		ts1.add(e22);
		ts1.add(e32);
		System.out.println(ts1);

	}

}

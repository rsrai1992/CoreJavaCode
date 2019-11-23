package com.collection.example;

import java.util.HashSet;
/*
 For making the class as immutable, declared the variable as final and setter is not required.
 After adding two EmployeeDemo objects, we can change the second object id as first one,
 which will violate the set property.
 In the following case, we can't change id of object e2 after adding in HashSet. 
 */

public class HashSetDuplicateChecking {

	public static void main(String[] args) {
		HashSet<EmployeeDemo> h = new HashSet<EmployeeDemo>();
		EmployeeDemo e1 = new EmployeeDemo(1);
		EmployeeDemo e2 = new EmployeeDemo(2);
		h.add(e1);
		h.add(e2);
		e2.id=1;
		System.out.println(h);
	}

}
class EmployeeDemo{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeDemo(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
}

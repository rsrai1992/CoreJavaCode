package com.java8.oreilly;

public class TargetType {
	
	public interface Email{
		String constructEmail(String name);
	}
	
	Email email = (String name) -> name +"@ravirai.com";
	
	public String getEmail(String name, Email email) {
		System.out.println("Name : "+name);
		return null;
	}

	public static void main(String[] args) {
		new TargetType().getEmail("ravi", (String name) -> name +"@topcoder.com");

	}

}

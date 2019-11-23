package com.java8.oreilly;

public class CreatingLabda {
	
	interface Greeting{
		public String sayHello(String g);
	}
	
	public void testGreeting(String a, Greeting g) {
		String result = g.sayHello(a);
		System.out.println("Result : "+result);
	}

	public static void main(String[] args) {
		new CreatingLabda().testGreeting("Harry", (String s)->"Hello, "+s);

		new CreatingLabda().testGreeting("", (String p)-> !p.isEmpty()?"Howdy, "+p:"Did you missed something");
	}

}

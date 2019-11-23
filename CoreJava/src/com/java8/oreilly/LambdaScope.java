package com.java8.oreilly;

public class LambdaScope extends SuperScope {
	
	private String member = "GRANDPA";
	
	@FunctionalInterface
	interface Family{
		String who(String member);
	}

	public void testMember(String member) {
		System.out.println("Without Lambda : ");
		System.out.println("Local member : "+member);
		System.out.println("Family member : "+this.member);
		System.out.println("Family member : "+super.member);
		
		System.out.println("With Lambda : ");
		Family familyLambda = (familyMember)->{
			System.out.println("Local lambda member : "+familyMember);
			System.out.println("Local lambda member : "+member);
			System.out.println("Local lambda this.member : "+this.member);
			System.out.println("Local lambda super.member : "+super.member);
			return familyMember;
		};
		familyLambda.who(member);
		
	}
	public static void main(String[] args) {
		new LambdaScope().testMember("SON");

	}

}

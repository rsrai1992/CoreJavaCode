package com.generics;

public class AccountMain {

	public static void main(String[] args) {
     Account<Gold> at= new Account<Gold>("Gold");
     System.out.println(at.getAccountType());
	}

}

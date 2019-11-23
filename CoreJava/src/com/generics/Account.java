package com.generics;

public class Account<T> {
	String accountType;

	public Account(String accountType) {
		super();
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}

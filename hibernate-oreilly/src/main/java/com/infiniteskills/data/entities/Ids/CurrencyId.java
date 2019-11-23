package com.infiniteskills.data.entities.Ids;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CurrencyId implements Serializable{
	
	public String name;
	public String countryName;
	
	public CurrencyId() {
		
	}
	
	public CurrencyId(String name, String countryName) {
		super();
		this.name = name;
		this.countryName = countryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}


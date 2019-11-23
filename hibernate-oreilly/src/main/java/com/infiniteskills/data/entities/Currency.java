package com.infiniteskills.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.infiniteskills.data.entities.Ids.CurrencyId;

@Entity
@IdClass(CurrencyId.class)
public class Currency {
	
	@Id
	@Column(name="name")
	public String name;
	
	@Id
	@Column(name="country_name")
	public String countryName;
	
	@Column(name = "symbol")
	public String symbol;

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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}

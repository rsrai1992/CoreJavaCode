package com.infiniteskills.data.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Investment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
	@TableGenerator(table = "ifinances_keys",pkColumnName = "pk_name", pkColumnValue = "pk_value",name = "key_generator")
	@Column(name="invertment_id")
	private long investmentId;
	
	@JoinColumn(name="portfolio_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Portfolio portfolio;

	@Column(name = "name")
	protected String name;
	
	@Column(name = "issuer")
	protected String issuer;
	
	@Column(name = "purchase_date")
	protected Date purchaseDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public long getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(long investmentId) {
		this.investmentId = investmentId;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

}
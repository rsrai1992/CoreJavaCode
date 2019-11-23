package com.infiniteskills.data.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="market")
public class Market {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="market_id")
	private long marketId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="currency_name", referencedColumnName = "name"),
		@JoinColumn(name="country_name", referencedColumnName = "country_name")
	})
	private Currency currency;
	
	@Column(name="market_name")
	private String marketName;
	
	public long getMarketId() {
		return marketId;
	}
	public void setMarketId(long marketId) {
		this.marketId = marketId;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	

}

package com.infiniteskills.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bond")
public class Bond extends Investment{
	
	@Id
	@GeneratedValue
	@Column(name="bond_id")
	private long bondId;
	
	@Column(name="value")
	private BigDecimal value;
	
	@Column(name="interest_rate")
	private BigDecimal intrestRate;
	
	@Column(name="maturity_date")
	private Date maturityDate;

	public long getBondId() {
		return bondId;
	}

	public void setBondId(long bondId) {
		this.bondId = bondId;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(BigDecimal intrestRate) {
		this.intrestRate = intrestRate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

}

package com.infiniteskills.data.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="budget")
public class Budget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="budget_id")
	private long budgetId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="max_amount")
	private BigDecimal maxAmount;
	
	@Column(name="peroid")
	private String period;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="budget_transaction", joinColumns = @JoinColumn(name="budget_id"),
//	inverseJoinColumns = @JoinColumn(name="transaction_id"))
//	private List<TransactionData> transaction = new ArrayList();
	
	public long getBudgetId() {
		return budgetId;
	}
	public void setBudgetId(long budgetId) {
		this.budgetId = budgetId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
//	public List<TransactionData> getTransaction() {
//		return transaction;
//	}
//	public void setTransaction(List<TransactionData> transaction) {
//		this.transaction = transaction;
//	}
	
	

}

package com.infiniteskills.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "budget_transaction")
public class BudgetTransaction {
	
	@Column(name="transaction_id")
	private long transactionId;
	
	@Column(name="budget_id")
	private long budgetId;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(long budgetId) {
		this.budgetId = budgetId;
	}
	
	

}

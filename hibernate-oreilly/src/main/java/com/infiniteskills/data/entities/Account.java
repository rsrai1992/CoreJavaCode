package com.infiniteskills.data.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	//@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_id")
	private long accountId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_account", joinColumns = @JoinColumn(name="account_id"),
	inverseJoinColumns = @JoinColumn(name="user_id"))
	private Set<User> users = new HashSet<User>();
	
	@ManyToOne
	@JoinColumn(name="bank_id")
	private Bank bank;
	
	@Enumerated(EnumType.STRING)
	@Column(name="account_type")
	private AccountTypeEnum accountType;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_ID", nullable = false)
	List<TransactionData> transaction = new ArrayList<TransactionData>();
	
//	@Column(name="bank_id")
//	private long bankId;
	
//	@Column(name="account_type")
//	private long accountType;
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public AccountTypeEnum getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}
	public List<TransactionData> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<TransactionData> transaction) {
		this.transaction = transaction;
	}
	@Column(name="name")
	private String name;
	
	@Column(name="initial_balance")
	private double initialBalance;
	
	@Column(name="current_balance")
	private double currentBalance;
	
	@Column(name="open_date")
	private Date openDate;
	
	@Column(name="close_date")
	private Date closeDate;
	
	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
//	public long getBankId() {
//		return bankId;
//	}
//	public void setBankId(long bankId) {
//		this.bankId = bankId;
//	}
//	public long getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(long accountType) {
//		this.accountType = accountType;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
//	public List<TransactionData> getTransaction() {
//		return transaction;
//	}
//	public void setTransaction(List<TransactionData> transaction) {
//		this.transaction = transaction;
//	}
//	public Set<User> getUsers() {
//		return users;
//	}
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
	
}

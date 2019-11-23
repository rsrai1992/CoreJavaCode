package com.infiniteskills.data.entities;

import java.util.Date;

public class AccountType {
	
	private long accountTypeId;
	private String name;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private String createdBy;
	private Date createdDate;
	public long getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(long accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
}

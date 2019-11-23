package com.infiniteskills.data.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bank_id")
	private long bankId;
	
	@Column(name="name")
	private String name;
	
	@Embedded
	private Address address = new Address();

	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="is_international")
	private boolean international;
	
//	@ElementCollection
//	@CollectionTable(name="bank_contact", joinColumns = @JoinColumn(name="BANK_ID"))
//	@MapKeyColumn(name ="POSITION_TYPE")
//	@Column(name="NAME")
//	private Map<String, String> contacts = new HashMap<String, String>();
	
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return address.addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.address.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return address.addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.address.addressLine2 = addressLine2;
	}
	public String getCity() {
		return address.city;
	}
	public void setCity(String city) {
		this.address.city = city;
	}
	public String getState() {
		return address.state;
	}
	public void setState(String state) {
		this.address.state = state;
	}
	public String getZipCode() {
		return address.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.address.zipCode = zipCode;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isInternational() {
		return international;
	}
	public void setInternational(boolean international) {
		this.international = international;
	}
//	public Map<String, String> getContacts() {
//		return contacts;
//	}
//	public void setContacts(Map<String, String> contacts) {
//		this.contacts = contacts;
//	}
	
}

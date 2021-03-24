package com.mtm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	@Id
	private Integer itemId;
	
	@Column(length=20)
	private String itemName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CUSTOMER_ITEMS", joinColumns=@JoinColumn(name="ITEMID_FK"),
	inverseJoinColumns=@JoinColumn(name="CUSTOMERID_FK"))
	private List<Customer>  customers;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	

}

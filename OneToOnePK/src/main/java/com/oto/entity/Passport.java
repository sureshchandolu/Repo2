package com.oto.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passport {
	@Id
	Integer passportNo;
	
	LocalDate  expDate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PERSONID_FK", unique=true)
	Person  person;

	public Integer getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}

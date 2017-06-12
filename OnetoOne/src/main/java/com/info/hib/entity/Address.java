package com.info.hib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ADDRESS")
public class Address {
	
	@Id
	@Column(name="STATE")
	private String state;
	
	@Column(name="CITY")
	private String city;

	@Column(name="STREET")
	private String street;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}

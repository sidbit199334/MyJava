package com.info.hib.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="WORKERS")
public class Workers {
	
@Id
@Column(name="NAME")
private String name;

@Column(name="OCCUPATION")
private String occupation;

@OneToOne(cascade =CascadeType.ALL)
@JoinColumn(name="STATE")
private Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}



}

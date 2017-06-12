package com.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="register")
@XmlAccessorType(XmlAccessType.NONE)
public class Register {
	
@XmlElement(name="username")
private String username;

@XmlElement(name="age")
private int age;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

@XmlElement(name="sex")
private String sex;

}

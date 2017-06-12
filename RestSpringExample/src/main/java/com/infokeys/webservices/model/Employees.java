package com.infokeys.webservices.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employees")
@XmlAccessorType(XmlAccessType.NONE)
public class Employees {
 
 @XmlElement(name="employee")
 List<Employee> employees= new ArrayList<Employee>();

 public List<Employee> getEmployees() {
  return employees;
 }

 public void setEmployees(List<Employee> employees) {
  this.employees = employees;
 }
 
}


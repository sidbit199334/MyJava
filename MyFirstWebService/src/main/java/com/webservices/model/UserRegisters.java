package com.webservices.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="register")
@XmlAccessorType(XmlAccessType.NONE)
public class UserRegisters {

	private List<Register> Registers =new ArrayList<Register>();

	public List<Register> getRegisters() {
		return Registers;
	}

	public void setRegisters(List<Register> registers) {
		Registers = registers;
	}
    

}

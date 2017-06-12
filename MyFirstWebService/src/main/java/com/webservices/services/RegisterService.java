package com.webservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.dao.RegisterDao;
import com.webservices.entity.RegisterEntity;
import com.webservices.model.Register;

@Service("registerService")
public class RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	public Register getUserDetailsByUsername(String username){
		RegisterEntity regEnt =registerDao.getUserDetailsByUsername(username);
		//JAXB xml binding payload creation
		Register reg =new Register();
		reg.setUsername(regEnt.getUsername());
		reg.setAge(regEnt.getAge());
		reg.setSex(regEnt.getSex());
		return reg;
	}

}

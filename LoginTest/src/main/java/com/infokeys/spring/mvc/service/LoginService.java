package com.infokeys.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokeys.spring.mvc.dao.LoginDao;



@Service("loginService")
public class LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public boolean loginChecks(String username,String password){
		return loginDao.loginCheck(username, password);
	}

}
 
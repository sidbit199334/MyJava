package com.infokeys.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infokeys.hibernate.mvc.entity.LogIn;

@Repository("loginDao")
public class LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public boolean loginCheck(String username,String password){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		LogIn login = (LogIn) session.get(LogIn.class, username);
		if(login != null){
			if(login.getUserName().equalsIgnoreCase(username) && login.getPassword().equalsIgnoreCase(password)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
			
		
	

}

package com.webservices.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webservices.entity.RegisterEntity;

@Repository("registerDao")
public class RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	public RegisterEntity getUserDetailsByUsername(String username) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		RegisterEntity regEnt = (RegisterEntity) session.load(RegisterEntity.class, username);
		return regEnt;

	}
}

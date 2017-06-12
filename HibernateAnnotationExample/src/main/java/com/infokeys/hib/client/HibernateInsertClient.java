package com.infokeys.hib.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infokeys.hib.entity.Students;

import sidhuHibernate.HibernateExamples.util.HibernateUtil;


public class HibernateInsertClient {
	public static void main(String args[]){
		SessionFactory sf = HibernateUtil.getSessionfactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Students std =new Students();
		std.setFirstname("sammer");
		std.setLastname("kochhar");
		std.setRno(10);
		std.setEmail("samkoch123");
		std.setPercentage(3.45);
		s.save(std);
		s.getTransaction().commit();

}
}

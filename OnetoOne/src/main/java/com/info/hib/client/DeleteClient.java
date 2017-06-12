package com.info.hib.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.hib.entity.Workers;
import com.info.hib.util.HibernateUtil;

public class DeleteClient {
	public static void main(String args[]){
		SessionFactory sf = HibernateUtil.getSessionfactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Workers wrk =(Workers) s.load(Workers.class,"mark");
		s.delete(wrk);
		
		s.getTransaction().commit();

}
}

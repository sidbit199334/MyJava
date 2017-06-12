package com.info.hib.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.hib.entity.Address;
import com.info.hib.entity.Workers;
import com.info.hib.util.HibernateUtil;

public class ReadClient {
	public static void main(String args[]){
		SessionFactory sf = HibernateUtil.getSessionfactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Workers wrk =(Workers) s.load(Workers.class,"john");
		Address adr = wrk.getAddress();
		System.out.println(wrk);		
		System.out.println(adr.getCity()+","+adr.getState()+","+adr.getStreet());
	System.out.println(wrk.getName());
		s.getTransaction().commit();

}
}
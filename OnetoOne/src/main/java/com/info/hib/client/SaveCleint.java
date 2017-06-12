package com.info.hib.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.hib.entity.Address;
import com.info.hib.entity.Workers;
import com.info.hib.util.HibernateUtil;


public class SaveCleint {
	public static void main(String args[]){
		SessionFactory sf = HibernateUtil.getSessionfactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Address adr =new Address();
		adr.setState("Texas");
		adr.setCity("Irving");
		adr.setStreet("McArthur St");
		Workers wrk =new Workers();
		wrk.setName("john");
		wrk.setOccupation("engineer");
		wrk.setAddress(adr);
		s.save(wrk);
		s.getTransaction().commit();

}
}

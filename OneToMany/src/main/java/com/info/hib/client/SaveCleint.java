package com.info.hib.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.hib.entity.Books;
import com.info.hib.entity.Chapters;
import com.info.hib.util.HibernateUtil;


public class SaveCleint {
	public static void main(String args[]){
		SessionFactory sf = HibernateUtil.getSessionfactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Books bk =new Books();
		bk.setBook_id("1");
		bk.setBook_name("Half Girlfriend");
		Chapters ch1=new Chapters();
		ch1.setChapter_id("101");
		ch1.setChapter_name("Mystery");
	
		Chapters ch2=new Chapters();
		ch2.setChapter_id("102");
		ch2.setChapter_name("Revival");
		
		Chapters ch3=new Chapters();
		ch3.setChapter_id("103");
		ch3.setChapter_name("Happiness");
		
		Set<Chapters> ch =new HashSet<Chapters>();
		ch.add(ch1);
		ch.add(ch2);
		ch.add(ch3);
		bk.setChapters(ch);
		s.save(bk);
		s.getTransaction().commit();

}
} 

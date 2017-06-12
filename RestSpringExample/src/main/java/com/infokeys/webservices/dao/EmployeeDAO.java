package com.infokeys.webservices.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infokeys.webservices.entity.EmployeeEntity;
import com.infokeys.webservices.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<EmployeeEntity> getEmployees(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from EmployeeEntity");
		return query.list();
	}
	
	public EmployeeEntity getEmployeeById(String employeeId){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		EmployeeEntity empEntity = (EmployeeEntity) session.load(EmployeeEntity.class, employeeId);
		return empEntity;
	}
	
	public boolean createEmployees(List<EmployeeEntity> employees){
		Session session = sessionFactory.openSession();
		try{
			session.beginTransaction();
			for (EmployeeEntity employeeEntity : employees) {
				session.save(employeeEntity);
			}
			session.getTransaction().commit();
			session.close();
			return true;
		}catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
			return false;
		}
	}
	
	public boolean updateEmployee(Employee employee){
		Session session = sessionFactory.openSession();
		try{
			System.out.println("I am try block>>>>>>>>>>>>>>>>>>" + employee.getEmployeeId());
			session.beginTransaction();
			EmployeeEntity entity =  (EmployeeEntity) session.load(EmployeeEntity.class, employee.getEmployeeId());
			entity.setEmpName(employee.getEmployeeName());
			entity.setEmpJob(employee.getEmployeeJob());
			session.update(entity);
			session.getTransaction().commit();
			session.close();
			System.out.println("I am try before return >>>>>>>>>>>>>>>>>>");
			return true;
		}catch (Exception e) {
			System.out.println("I am try catch>>>>>>>>>>>>>>>>>>");
			session.close();
			return false;
		}
	}
	
	public boolean deleteEmployee(String employeeId){
		Session session = sessionFactory.openSession();
		try{
			session.beginTransaction();
			EmployeeEntity entity =  (EmployeeEntity) session.load(EmployeeEntity.class, employeeId);
			session.delete(entity);
			session.getTransaction().commit();
			session.close();
			return true;
		}catch (Exception e) {
			session.close();
			return false;
		}
	}

}

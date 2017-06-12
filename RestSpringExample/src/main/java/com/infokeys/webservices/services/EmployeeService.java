package com.infokeys.webservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokeys.webservices.dao.EmployeeDAO;
import com.infokeys.webservices.entity.EmployeeEntity;
import com.infokeys.webservices.model.Employee;
import com.infokeys.webservices.model.Employees;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public Employees getAllEmployees(){
		List<EmployeeEntity> employeeList = employeeDAO.getEmployees();
		Employees employees = new Employees();
		
		for (EmployeeEntity employeeEntity : employeeList) {
			Employee emp = new Employee();
			emp.setEmployeeId(employeeEntity.getEmpId());
			emp.setEmployeeName(employeeEntity.getEmpName());
			emp.setEmployeeJob(employeeEntity.getEmpJob());
			employees.getEmployees().add(emp);
		}
		return employees;
		
	}
	
	public Employee getEmployeeById(String employeeId){
		EmployeeEntity empEntity = employeeDAO.getEmployeeById(employeeId);
		Employee emp = new Employee();
		emp.setEmployeeId(empEntity.getEmpId());
		emp.setEmployeeName(empEntity.getEmpName());
		emp.setEmployeeJob(empEntity.getEmpJob());
		return emp;
	}
	
	public boolean createEmployees(Employees employees){
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		List<Employee> emplList = employees.getEmployees();
		for (Employee employee : emplList) {
			EmployeeEntity empEntity = new EmployeeEntity();
			empEntity.setEmpId(employee.getEmployeeId());
			empEntity.setEmpName(employee.getEmployeeName());
			empEntity.setEmpJob(employee.getEmployeeJob());
			employeeList.add(empEntity);
		}
		return employeeDAO.createEmployees(employeeList);
		
	}
	
	public boolean updateEmployee(Employee employee){
		return employeeDAO.updateEmployee(employee);
	}
	
	public boolean deleteEmployee(String employeeId){
		return employeeDAO.deleteEmployee(employeeId);
	}

}

package com.infokeys.webservices.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.infokeys.webservices.model.Employee;
import com.infokeys.webservices.model.Employees;

public class PostClient {
	
public static void main(String[] args) {
		
		String url = "http://localhost:8084/RestSpringExample/employees/addEmployees";
		
		Employees emps = new Employees();
		Employee emp = new Employee();
		emp.setEmployeeId("6");
		emp.setEmployeeName("krishna");
		emp.setEmployeeJob("SE");
		emps.getEmployees().add(emp);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ResponseEntity> result = restTemplate.postForEntity(url, emps, ResponseEntity.class);
		System.out.println(result.getStatusCode());

	}
}

package com.infokeys.webservices.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.infokeys.webservices.model.Employee;

public class ReadClient {

	public static void main(String[] args) {
		
		String url = "http://localhost:8084/RestSpringExample/employees/getEmployeeById/{id}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "1");
		
		RestTemplate restTemplate = new RestTemplate();
		Employee employee = restTemplate.getForObject(url, Employee.class, params);
		System.out.println(employee.getEmployeeName());

	}

}

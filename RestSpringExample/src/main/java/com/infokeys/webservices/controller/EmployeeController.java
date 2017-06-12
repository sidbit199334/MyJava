package com.infokeys.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infokeys.webservices.model.Employee;
import com.infokeys.webservices.model.Employees;
import com.infokeys.webservices.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/getAllEmployees",method=RequestMethod.GET,headers="Accept=*/*")
	public @ResponseBody Employees getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value = "/getEmployeeById/{id}",method=RequestMethod.GET,headers="Accept=*/*")
	public @ResponseBody Employee getEmployeeDetails(@PathVariable String id){
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping(value = "/addEmployees",method=RequestMethod.POST,headers="Accept=*/*")
	public ResponseEntity<String> addEmployees(@RequestBody Employees employees){
		if(employeeService.createEmployees(employees)){
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}else{
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/updateEmployee",method=RequestMethod.PUT,headers="Accept=*/*")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		if(employeeService.updateEmployee(employee)){
			return new ResponseEntity<String>(HttpStatus.OK);
		}else{
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/deleteEmployee/{id}",method=RequestMethod.DELETE,headers="Accept=*/*")
	public ResponseEntity<String> deleteeEmployee(@PathVariable String id){
		if(employeeService.deleteEmployee(id)){
			return new ResponseEntity<String>(HttpStatus.OK);
		}else{
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

}

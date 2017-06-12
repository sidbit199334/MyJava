package com.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webservices.model.Register;
import com.webservices.services.RegisterService;

@Controller
public class UserRegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/getUserDetails/{username}", method = RequestMethod.GET, headers = "Accept=*/*")
	public @ResponseBody Register getUserDetailsByUsername(@PathVariable String username) {
		return registerService.getUserDetailsByUsername(username);

	}
	
	//add
	
	//delete

}

package com.infokeys.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infokeys.spring.mvc.service.LoginService;

@Controller
public class LoginCredentials {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/logindetails")
	public ModelAndView LoginDetails(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {

		if (loginService.loginChecks(username, password)) {
			String message = "you have succcesfully logged in";

			ModelAndView m = new ModelAndView("success");
			m.addObject("username", username);
			m.addObject("password", password);
			m.addObject("message", message);
			return m;
		} else {
			ModelAndView m = new ModelAndView("index");
			return m;
		}

	}
}

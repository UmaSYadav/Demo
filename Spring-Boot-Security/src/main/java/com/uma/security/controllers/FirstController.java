package com.uma.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping({"/", "/home"})
	public String getHome() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String getLogin() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String getLogout() {
		return "logout.jsp";
	}
}

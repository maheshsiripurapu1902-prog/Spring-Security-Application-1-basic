package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginFormController {
	
	@GetMapping("/")
	public String getFormPage() {
		
		
		return "this is my first Spring Security application";
	}

}

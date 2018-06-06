package com.shivumytri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping("/welcome")
	public String sendWelcomMessage() {
		return "Hello to Spring Boot.";
	}

}

package com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/")
	public String welcomeMsg() {
		return " Welcome to AWS .......  Deploy Springboot Application On Cloud";
	}

}

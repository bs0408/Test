package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApp {
	
	@GetMapping("/status")
	public String getStatus()  {
		
		return "App is running...";
		
	}

}

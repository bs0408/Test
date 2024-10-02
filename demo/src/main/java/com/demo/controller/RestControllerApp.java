package com.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApp {
	
	@GetMapping("/status")
	public String getStatus()  {
		
		return "App is running...";
		
	}
	
	@GetMapping("/getDate")
	public Date getDate() {
		
		return new Date();
		
	}

}

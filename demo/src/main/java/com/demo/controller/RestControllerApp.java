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
	
	public void getHello12() {
		
		System.out.println("get Hello from rest");
		System.out.println("Hello from eclipse");
		
	}
	
	@GetMapping("/getDate")
	public Date getDate1() {
		
		System.out.println("getDate Testing: ");
		return new Date();
		
		
	}
	
	
	public void getm1() {
		
		System.out.println("Hello:");
	}
	
	@GetMapping("/getTime")
	public int getDateAndTime() {
		
		Date date=new Date();
		return date.getDay();
		
		
	}
	
	
}

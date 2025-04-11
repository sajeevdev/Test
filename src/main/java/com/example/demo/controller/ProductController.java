package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	@GetMapping("/")
	public String getEmployee() {
		
		return "hi This is sanjeev";
		
	}

}

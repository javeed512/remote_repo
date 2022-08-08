package com.wipro.localconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.localconfig.entity.Product;
import com.wipro.localconfig.service.ProductService;

@RestController
public class HelloController {
	
	
	@Value("${message}")
	String msg;
	
	@Value("${spring.datasource.url}")
	String url;
	
	@Autowired
	ProductService service;
	
	
	@GetMapping("/greet")
	public String   greeting() {
		
		return msg;
		
	}
	
	
	@GetMapping("/url")
	public String  getURL() {
		
		
		return url;
		
	}
	
	@PostMapping("/add")
	public  Product   addProduct(@RequestBody Product product) {
		
		
		return service.addProduct(product);
		
	}
	
	

}

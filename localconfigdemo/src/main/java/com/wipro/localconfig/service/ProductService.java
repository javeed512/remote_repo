package com.wipro.localconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.localconfig.entity.Product;
import com.wipro.localconfig.repository.ProductRepository;

@Service
public class ProductService {
	
		@Autowired
		ProductRepository repo;
	
	public Product addProduct(Product product) {
		
		
	return	repo.save(product);
		
		
	}

}

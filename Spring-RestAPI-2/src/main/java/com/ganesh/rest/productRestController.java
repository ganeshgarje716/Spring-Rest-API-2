package com.ganesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.Product;
import com.ganesh.service.ProductService;

@RestController
public class productRestController {

	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping("/product/{id}")
	public void getProductById(@PathVariable Integer id) {
		
		Product product = productService.getProductById(id);
	}
}

package com.ganesh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty;
	
	private String category;
	

}

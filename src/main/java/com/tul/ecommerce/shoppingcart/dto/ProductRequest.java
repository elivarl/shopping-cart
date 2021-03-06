package com.tul.ecommerce.shoppingcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
	private Long id;
	private String name;
	private String description;
	private double price;
	private String productType;

}

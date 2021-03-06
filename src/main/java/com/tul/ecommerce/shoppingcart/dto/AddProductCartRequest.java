package com.tul.ecommerce.shoppingcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductCartRequest {
	private Long id;
	private Long idUser;
	private Long idProduct;
	private double units;

}

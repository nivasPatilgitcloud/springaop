package com.spring.springaop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	public void checkout(Boolean status) {
		if(status) {
			System.out.println("Product added to cart status is : "+status);
		}else {
			System.out.println("Product added to cart status is : "+status);
		}
		
	}
}

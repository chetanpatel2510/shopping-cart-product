package com.shoppingcart.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This is spring boot application runner for product service.
 * 
 * @author Chetan
 *
 */
@EnableSwagger2
@SpringBootApplication
public class ShoppingCartProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartProductApplication.class, args);
	}

}

/**
 * 
 */
package com.shoppingcart.product.entities;

import java.util.Set;

/**
 * @author root
 *
 */
public class Seller {

	private String id;
	
	private String firstName;
	
	private String lastName;

	private String email;
	
	private String phone;

	private Address address;
	
	private Set<Product> products;
	
}
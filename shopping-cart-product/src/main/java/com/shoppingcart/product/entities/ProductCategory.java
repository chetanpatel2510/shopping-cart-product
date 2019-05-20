package com.shoppingcart.product.entities;

/**
 * This class is entity class for product category.
 * @author root
 *
 */
public class ProductCategory extends BaseEntity {

	/**
	 * Id. Primary key 
	 */
	private Long id;
	
	/**
	 * Name of the category.
	 */
	private String name;

	/**
	 * Getter method for id
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter method for id
	 *
	 * @param id 
	 *			the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter method for name
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 *
	 * @param name 
	 *			the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}

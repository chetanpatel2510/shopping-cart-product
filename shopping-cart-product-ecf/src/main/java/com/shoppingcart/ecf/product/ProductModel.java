package com.shoppingcart.ecf.product;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * This class will hold the Product information to be communicated to other
 * microservices.
 * 
 * @author Chetan
 *
 */
public class ProductModel {

	/**
	 * Name of the product.
	 */
	private String name;
	
	/**
	 * Product Code.
	 */
	private String code;
	
	/**
	 * Description
	 */
	private String description;
	
	/**
	 * Product category.
	 */
	private String category;
	
	/**
	 * Price of the product.
	 */
	private BigDecimal price;
	
	/**
	 * Marketing start date of the product.
	 */
	private Date marketingStartDate;
	
	/**
	 * Marketing end date of the product.
	 */
	private Date marketingEndDate;

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

	/**
	 * Getter method for code
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter method for code
	 *
	 * @param code 
	 *			the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter method for description
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter method for description
	 *
	 * @param description 
	 *			the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter method for category
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Setter method for category
	 *
	 * @param category 
	 *			the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Getter method for price
	 *
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Setter method for price
	 *
	 * @param price 
	 *			the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * Getter method for marketingEndDate
	 *
	 * @return the marketingEndDate
	 */
	public Date getMarketingEndDate() {
		return marketingEndDate;
	}

	/**
	 * Setter method for marketingEndDate
	 *
	 * @param marketingEndDate 
	 *			the marketingEndDate to set
	 */
	public void setMarketingEndDate(Date marketingEndDate) {
		this.marketingEndDate = marketingEndDate;
	}

	/**
	 * Getter method for marketingStartDate
	 *
	 * @return the marketingStartDate
	 */
	public Date getMarketingStartDate() {
		return marketingStartDate;
	}

	/**
	 * Setter method for marketingStartDate
	 *
	 * @param marketingStartDate 
	 *			the marketingStartDate to set
	 */
	public void setMarketingStartDate(Date marketingStartDate) {
		this.marketingStartDate = marketingStartDate;
	}

}

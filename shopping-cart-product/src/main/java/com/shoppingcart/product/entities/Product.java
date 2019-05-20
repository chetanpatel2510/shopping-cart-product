package com.shoppingcart.product.entities;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * Entity class for product.
 *
 * @author Chetan
 *
 */
@Table
public class Product extends BaseEntity {

	/**
	 * Product Id. Primary key.
	 */
	@PrimaryKeyColumn(name="ID", ordinal = 0, type = PrimaryKeyType.CLUSTERED)
	private Long id;
	
	/**
	 * Name of the product.
	 */
	@Column(value="PRODUCT_NAME")
	private String productName;
	
	/**
	 * Product Code.
	 */
	@PrimaryKeyColumn(name="PRODUCT_CODE", ordinal = 0, type=PrimaryKeyType.PARTITIONED)
	private String productCode;
	
	/**
	 * Description
	 */
	@Column(value="PRODUCT_DESC")
	private String productDescription;
	
	/**
	 * Product category.
	 */
	@PrimaryKeyColumn(name="PRODUCT_CATEGORY", ordinal = 1, type=PrimaryKeyType.PARTITIONED)
	private String productCategory;
	
	/**
	 * Price of the product.
	 */
	@Column(value="PRODUCT_PRICE")
	private BigDecimal productPrice;
	
	/**
	 * Marketing start date of product.
	 */
	@Column(value="MARKETING_START_DATE")
	private Date marketingStartDate;
	
	/**
	 * Marketing End date.
	 */
	@Column(value="MARKETING_END_DATE")
	private Date marketingEndDate;

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
	 * Getter method for productName
	 *
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Setter method for productName
	 *
	 * @param productName 
	 *			the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Getter method for productCode
	 *
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Setter method for productCode
	 *
	 * @param productCode 
	 *			the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Getter method for productDescription
	 *
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * Setter method for productDescription
	 *
	 * @param productDescription 
	 *			the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * Getter method for productCategory
	 *
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * Setter method for productCategory
	 *
	 * @param productCategory 
	 *			the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * Getter method for productPrice
	 *
	 * @return the productPrice
	 */
	public BigDecimal getProductPrice() {
		return productPrice;
	}

	/**
	 * Setter method for productPrice
	 *
	 * @param productPrice 
	 *			the productPrice to set
	 */
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
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

	
}

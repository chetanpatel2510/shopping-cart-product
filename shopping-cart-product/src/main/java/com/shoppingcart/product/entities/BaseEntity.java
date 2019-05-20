package com.shoppingcart.product.entities;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;

/**
 * This class is base class for all entity classes.
 * 
 * @author Chetan
 *
 */
public class BaseEntity {

	/**
	 * Record Created By.
	 */
	@Column(value="CREATED_BY")
	private String createdBy;
	
	/**
	 * Record last updated by.
	 */
	@Column(value = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	
	/**
	 * Record creation date.
	 */
	@Column(value = "CREATED_ON")
	private Date createdOn;
	
	/**
	 * Record last updated date.
	 */
	@Column(value = "LAST_UPDATED_ON")
	private Date lastUpdatedOn;

	/**
	 * Getter method for createdBy
	 *
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Setter method for createdBy
	 *
	 * @param createdBy 
	 *			the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Getter method for lastUpdatedBy
	 *
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * Setter method for lastUpdatedBy
	 *
	 * @param lastUpdatedBy 
	 *			the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/**
	 * Getter method for createdOn
	 *
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * Setter method for createdOn
	 *
	 * @param createdOn 
	 *			the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * Getter method for lastUpdatedOn
	 *
	 * @return the lastUpdatedOn
	 */
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	/**
	 * Setter method for lastUpdatedOn
	 *
	 * @param lastUpdatedOn 
	 *			the lastUpdatedOn to set
	 */
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
}

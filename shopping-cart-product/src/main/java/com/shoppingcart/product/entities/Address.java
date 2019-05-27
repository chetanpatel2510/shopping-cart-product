/**
 * 
 */
package com.shoppingcart.product.entities;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import com.datastax.driver.core.DataType.Name;

/**
 * Address Information
 * 
 * @author Chetan
 *
 */
@UserDefinedType("ADDRESS")
public class Address {

	/**
	 * addressLine1
	 */
	private String addressLine1;
	
	/**
	 * addressLine2.
	 */
	private String addressLine2;
	
	/**
	 * city
	 */
	private String city;
	
	/**
	 * state
	 */
	private String state;
	
	/**
	 * zipcode.
	 */
	private String zipcode;
	
	/**
	 * Country.
	 */
	private String country;

	/**
	 * Getter method for addressLine1
	 *
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * Setter method for addressLine1
	 *
	 * @param addressLine1 
	 *			the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * Getter method for addressLine2
	 *
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * Setter method for addressLine2
	 *
	 * @param addressLine2 
	 *			the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * Getter method for city
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter method for city
	 *
	 * @param city 
	 *			the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter method for state
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Setter method for state
	 *
	 * @param state 
	 *			the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Getter method for zipcode
	 *
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Setter method for zipcode
	 *
	 * @param zipcode 
	 *			the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * Getter method for country
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Setter method for country
	 *
	 * @param country 
	 *			the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}

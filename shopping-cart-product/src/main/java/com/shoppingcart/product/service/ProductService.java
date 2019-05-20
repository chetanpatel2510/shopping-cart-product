/**
 * 
 */
package com.shoppingcart.product.service;

import com.shoppingcart.ecf.product.ProductModel;

/**
 * This interface will expose all methods required for products.
 * 
 * @author Chetan
 *
 */
public interface ProductService {

	/**
	 * This method will create product into database.
	 * 
	 * @param productModel
	 *            product information.
	 */
	void createProduct(final ProductModel productModel);
}

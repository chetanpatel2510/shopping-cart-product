package com.shoppingcart.product.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.ecf.product.ProductModel;
import com.shoppingcart.product.service.ProductService;
import com.shoppingcart.product.util.ProductLogger;

/**
 * This class will hold all rest end points for product service.
 * 
 * @author Chetan
 *
 */
@RestController
public class ProductController {
	
	/**
	 * logger declaration.
	 */
	@Autowired
	private ProductLogger logger;
	
	/**
	 * productService to call actual service implementation.
	 */
	@Autowired
	private ProductService productService;

	/**
	 * This rest end point will create product into the system.
	 * 
	 * @param productModel
	 *            product information.
	 * @return response status.
	 */
	@PostMapping("/createProduct")
	public ResponseEntity<String> createProduct(ProductModel productModel) {
		// TODO - validate product model
		productService.createProduct(productModel);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/getProductByCode/{code}")
	public ResponseEntity<ProductModel> getProductByCode(@PathParam("code") String productCode) {
		return new ResponseEntity<ProductModel>(HttpStatus.OK);
	}
}

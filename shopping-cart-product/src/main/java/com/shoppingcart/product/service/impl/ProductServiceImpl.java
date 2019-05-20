package com.shoppingcart.product.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.ecf.product.ProductModel;
import com.shoppingcart.product.entities.Product;
import com.shoppingcart.product.repository.ProductRepository;
import com.shoppingcart.product.service.ProductService;
import com.shoppingcart.product.util.DateUtils;
import com.shoppingcart.product.util.ProductLogger;

/**
 * This class will implement the methods exposed by ProductService.
 * 
 * @author Chetan
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	/**
	 * Product repository to access cassandra.
	 */
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * logger declaration.
	 */
	@Autowired
	private ProductLogger logger;
	
	@Override
	public void createProduct(ProductModel productModel) {
		Product product = new Product();
//		BeanUtils.copyProperties(productModel, product);
		product.setId(1L);
		product.setProductCode("CODE1");
		product.setMarketingEndDate(new java.sql.Date(DateUtils.getDateWithoutTimestamp().getTime()));
		product.setMarketingStartDate(new java.sql.Date(DateUtils.getDateWithoutTimestamp().getTime()));
		product.setProductName("Name");
		product.setProductDescription("Description");
		product.setProductCategory("PRODUCT_CATEGORY1");
		productRepository.save(product);
	}

}

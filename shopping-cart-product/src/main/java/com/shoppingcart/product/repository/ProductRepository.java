/**
 * 
 */
package com.shoppingcart.product.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.product.entities.Product;

/**
 * @author root
 *
 */
@Repository
public interface ProductRepository extends CassandraRepository<Product, Long>{

}

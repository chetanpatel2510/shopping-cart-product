/**
 * 
 */
package com.shoppingcart.product.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * This class will hold configuration to connect to cassandra.
 * 
 * @author Chetan
 *
 */
@Configuration
@EnableCassandraRepositories(basePackages="com.shoppingcart.product.repository")
public class ProductServiceCassandraConfig extends AbstractCassandraConfiguration {

	/**
	 * Cassandra keyspace name for product service.
	 */
	@Value("${cassandra.keyspace.name}")
	private String keySpaceName;
	
	/**
	 * IP Address of the cassandra host
	 */
	@Value("${cassandra.host.ip}")
	private String hostIp;
	
	/**
	 * Port number of cassandra.
	 */
	@Value("${cassandra.port}")
	private int port;
	
	/**
	 * Get key space name for the product service.
	 */
	@Override
	protected String getKeyspaceName() {
		return keySpaceName;
	}
	
	@Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = 
          new CassandraClusterFactoryBean();
        cluster.setContactPoints(hostIp);
        System.out.println("Cassandra port is "+port);
        cluster.setPort(port);
        cluster.setJmxReportingEnabled(false);
        return cluster;
    }
 
    @Bean
    public CassandraMappingContext cassandraMapping() 
      throws ClassNotFoundException {
        return new CassandraMappingContext();
    }
    

}

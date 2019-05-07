package com.shoppingcart.product.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class will hold all rest end points for product service.
 * 
 * @author Chetan
 *
 */
@RestController
public class ProductController {

	/**
	 * This rest end point will return the host information where the service is
	 * deployed.
	 * 
	 * @return host information.
	 * @throws UnknownHostException
	 *             unknownHostException if any.
	 */
	@GetMapping("/hostInfo")
	public String getHealthCheck() throws UnknownHostException {
		InetAddress localhost = InetAddress.getLocalHost();
		String ipAddress = localhost.getHostAddress();
		StringBuilder builder = new StringBuilder();
		builder.append("IP Address: ").append(ipAddress);
		builder.append("HostName: ").append(localhost.getHostName());
		builder.append("Canonical host name: ").append(localhost.getCanonicalHostName());
		
		return builder.toString();
	}
	
	/**
	 * This method will check health of the application. It can be used by
	 * kubernetes to check liveliness probe.
	 * 
	 * @return application data.
	 */
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "Success";
	}
	
	/**
	 * This method will be used by kubernetes to check the readiness probe.
	 * 
	 * @return readiness information.
	 */
	@GetMapping("/readiness")
	public String readinessProbe() {
		return "Success";
	}
}

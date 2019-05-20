/**
 * 
 */
package com.shoppingcart.product.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.product.util.ProductLogger;

/**
 * This class will expose rest end points to check health of the application and
 * other meta data information.
 * 
 * @author Chetan
 *
 */
@RestController
@RefreshScope
public class HealthController {
	/**
	 * logger declaration.
	 */
	@Autowired
	private ProductLogger logger;
	
	@Value("${application.user.name}")
	private String username;
	
	@Value("${properties.filename}")
	private String propertiesFile;
	
	@Value("${build.number:localBuild}")
	private String buildNumber;
	
	/**
	 * This rest end point will return the host information where the service is
	 * deployed.
	 * 
	 * @return host information.
	 * @throws UnknownHostException
	 *             unknownHostException if any.
	 */
	@GetMapping("/hostInfo")
	public String getHostInfo() throws UnknownHostException {
		InetAddress localhost = InetAddress.getLocalHost();
		String ipAddress = localhost.getHostAddress();
		StringBuilder builder = new StringBuilder();
		builder.append(" IP Address: ").append(ipAddress);
		builder.append("<br/> HostName: ").append(localhost.getHostName());
		builder.append("<br/> Canonical host name: ").append(localhost.getCanonicalHostName());
		builder.append("<br/> Properties File Loaded: ").append(propertiesFile);
		builder.append("<br/> User Name: ").append(username);
		builder.append("<br/> Build Number: ").append(buildNumber);
		
		
		logger.info(this, " Host Information is: {}", builder.toString());
		
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
		logger.info(this, "Health of the application is good...");
		return "Health of the application is good...";
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

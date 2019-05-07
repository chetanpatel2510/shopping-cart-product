package com.shoppingcart.product.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Log implementation.
 * 
 * @author Chetan
 *
 */
@Component
public class ProductLogger {

	/**
	 * This method will get logger for given class.
	 * 
	 * @param caller
	 *            caller of the logger.
	 * @return Logger object.
	 */
	public Logger getLogger(Object caller) {
		return LoggerFactory.getLogger(caller.getClass());
	}
	
	/**
	 * This method will log the message at debug level.
	 * 
	 * @param caller
	 *            caller.
	 * @param message
	 *            message
	 * @param params
	 *            parameters for the message.
	 */
	public void debug (Object caller, String message, Object...params) {
		getLogger(caller).debug(message, params);
	}
	
	/**
	 * This method will log the message at info level.
	 * 
	 * @param caller
	 *            caller.
	 * @param message
	 *            message
	 * @param params
	 *            parameters for the message.
	 */
	public void info (Object caller, String message, Object...params) {
		Logger logger = getLogger(caller);
		logger.info(message, params);
	}
	
	/**
	 * This method will log the message at warn level.
	 * 
	 * @param caller
	 *            caller.
	 * @param message
	 *            message
	 * @param params
	 *            parameters for the message.
	 */
	public void warn (Object caller, String message, Object...params) {
		getLogger(caller).warn(message, params);
	}
	
	/**
	 * This method will log the message at error level.
	 * 
	 * @param caller
	 *            caller.
	 * @param e
	 *            Exception object.
	 * @param message
	 *            message
	 * @param params
	 *            parameters for the message.
	 */
	public void error (Object caller, Throwable e, String message, Object...params) {
		getLogger(caller).error(message, params);
	}
}

package com.shoppingcart.product.util;

/**
 * This class will hold all constants for product service.
 * 
 * @author Chetan
 *
 */
public interface ProductConstants {
	/**
	 * This enum will contain all the date formats.
	 * 
	 * @author Chetan
	 *
	 */
	public enum DateFormat {
		DATE_FORMAT_YYYY_MM_DD("yyyy-mm-dd");
		
		private String format;
		
		private DateFormat(String format) {
			this.format = format;
		}
		
		public String getFormat() {
			return this.format;
		}
	}
}

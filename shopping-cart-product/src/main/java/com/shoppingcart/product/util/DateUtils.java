/**
 * 
 */
package com.shoppingcart.product.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.shoppingcart.product.util.ProductConstants.DateFormat;

/**
 * @author root
 *
 */
public class DateUtils {

	/**
	 * This method will convert java.util.Date to String in given format.
	 * 
	 * @param date
	 *            date object.
	 * @param format
	 *            format in which date need to be converted.
	 * @return String format of date.
	 */
	public static String getFormattedDate(final Date date, final String format) {
		String dateFormat = DateFormat.DATE_FORMAT_YYYY_MM_DD.getFormat();
		if (StringUtils.isNotBlank(format)) {
			dateFormat = format;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
	
	/**
	 * Get Date without time stamp.
	 * 
	 * @return date without time.
	 */
	public static Date getDateWithoutTimestamp() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
}

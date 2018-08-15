/**
 * 
 */
package com.shadab.grocery.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author mshadab
 *
 */
public class GroceryUtility {
	
	public static String getCurrentTimewithDate() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		  String date= dtf.format(now);  
		  return date;
	}

}

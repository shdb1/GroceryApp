/**
 * 
 */
package com.shadab.grocery.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.shadab.grocery.models.sale.Transaction;

/**
 * @author mshadab
 *
 */
public class GroceryRootContext {
	
	public static Map<String,Item> items = new HashMap<String,Item>();
	public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	

}

/**
 * 
 */
package com.shadab.grocery.models;

import java.util.Map;

/**
 * @author mshadab
 *
 */
public class InMemoryStorage {
	Map  itemTypeMap;
	Map discounts;
	
	public Map getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Map discounts) {
		this.discounts = discounts;
	}

	public Map getItemTypeMap() {
		return itemTypeMap;
	}

	public void setItemTypeMap(Map itemTypeMap) {
		this.itemTypeMap = itemTypeMap;
	}

	

}

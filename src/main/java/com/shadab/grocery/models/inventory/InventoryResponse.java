/**
 * 
 */
package com.shadab.grocery.models.inventory;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;


import com.shadab.grocery.models.Item;

/**
 * @author mshadab
 *
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class InventoryResponse {
	Map<String,Item> itemsAvailable;
	
	public Map<String, Item> getItemsAvailable() {
		return itemsAvailable;
	}

	public void setItemsAvailable(Map<String, Item> itemsAvailable) {
		this.itemsAvailable = itemsAvailable;
	}

	
	
	

	
}

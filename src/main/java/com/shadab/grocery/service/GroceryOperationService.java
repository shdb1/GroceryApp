/**
 * 
 */
package com.shadab.grocery.service;

import com.shadab.grocery.exceptions.SoldItemOutOfStockException;
import com.shadab.grocery.models.Item;
import com.shadab.grocery.models.sale.Transaction;

/**
 * @author mshadab
 *
 */
public interface GroceryOperationService {

	public void loadItemsInStore();
	public Transaction saleItem(String itemUniqueCode, String soldQuentity,String discountApplied);
	public boolean updateSoldItemInMemory (Item item , int soldQuantity, int availableQuantity) throws SoldItemOutOfStockException;
	
	
	
}

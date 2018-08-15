package com.shadab.grocery.api;

import org.springframework.web.bind.annotation.RequestMapping;

import com.shadab.grocery.models.GroceryRootContext;
import com.shadab.grocery.models.discount.DiscountResponse;
import com.shadab.grocery.models.inventory.InventoryResponse;

/**
 * @author mshadab
 *
 */
public interface DiscountApi {
	
	@RequestMapping("/discount/getdiscountinfo")
	public DiscountResponse getDiscount();
}
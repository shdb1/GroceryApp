package com.shadab.grocery.api;

import org.springframework.web.bind.annotation.RequestMapping;

import com.shadab.grocery.models.inventory.InventoryResponse;

/**
 * @author mshadab
 *
 */
public interface InventoryApi {
	
	@RequestMapping("/inventorydetails")
	public InventoryResponse inventoryDetails();
	
	@RequestMapping("/getInventoryByItem")
	public InventoryResponse getInventoryByItem();

}

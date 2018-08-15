package com.shadab.grocery.controller.inventory;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.grocery.api.InventoryApi;
import com.shadab.grocery.models.GroceryRootContext;
import com.shadab.grocery.models.inventory.InventoryResponse;

/**
 * @author mshadab
 *
 */

@RestController
public class InventoryController implements InventoryApi{
	
	@Autowired
	InventoryResponse inventoryResponse;
	
	private static final Logger logger = LoggerFactory.getLogger(InventoryController.class);

	@Override
	public InventoryResponse inventoryDetails() {
		logger.info("Request to get Inventory details");
		inventoryResponse.setItemsAvailable(GroceryRootContext.items);
		logger.info("Request completed to get Inventory details");
		return inventoryResponse;
	}

	@Override
	public InventoryResponse getInventoryByItem() {
		// TODO Auto-generated method stub
		return null;
	}


}

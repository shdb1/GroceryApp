/**
 * 
 */
package com.shadab.grocery.controller.sale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.grocery.api.SalesApi;
import com.shadab.grocery.models.GroceryRootContext;
import com.shadab.grocery.models.sale.SalesResponse;
import com.shadab.grocery.models.sale.Transaction;
import com.shadab.grocery.service.GroceryOperationService;

/**
 * @author mshadab
 *
 */
@RestController
public class SaleController implements SalesApi{
	
	@Autowired
	GroceryOperationService groceryOperationService;
	@Autowired
	SalesResponse salesResponse;
	
	private static final Logger logger = LoggerFactory.getLogger(SaleController.class);

	
	@Override
	public Transaction performSale(@RequestParam("itemUniqueCode") String itemUniqueCode,@RequestParam("quantitySold") String quantitySold,@RequestParam("discountApplied") String discountApplied) {
		logger.info("Request to Sale item");
		logger.info("quantitySold:"+quantitySold+"   itemUniqueCode"+itemUniqueCode+" discountApplied"+discountApplied);
		logger.info("Sale Operation completed");

		return groceryOperationService.saleItem(itemUniqueCode, quantitySold, discountApplied);
		
		
	}

	@Override
	public SalesResponse getSoldItems() {
		logger.info("Request To Get SOld items");
		salesResponse.setTransactionsPerformed(GroceryRootContext.transactions);
		logger.info("request Completed");
		return salesResponse;
	}
	
	@Override
	public String getTodaySell() {
		logger.info("Request to get Inventory details");
		
		logger.info("Request completed to get Inventory details");
		return "";
	}
}

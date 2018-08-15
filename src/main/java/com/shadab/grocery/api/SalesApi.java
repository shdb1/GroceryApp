/**
 * 
 */
package com.shadab.grocery.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shadab.grocery.models.sale.SalesResponse;
import com.shadab.grocery.models.sale.Transaction;

/**
 * @author mshadab
 *
 */
public interface SalesApi {
	
	@RequestMapping("sale/saleitem")
	public Transaction performSale(@RequestParam("itemUniqueCode") String itemUniqueCode,@RequestParam("quantitySold") String quantitySold,@RequestParam("discountApplied") String discountApplied);
    
	@RequestMapping("/sale/allsold")
	public SalesResponse getSoldItems();
	
	@RequestMapping("/sale/selldonetoday")
	public String getTodaySell();
}

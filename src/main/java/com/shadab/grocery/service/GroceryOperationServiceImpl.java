/**
 * 
 */
package com.shadab.grocery.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadab.grocery.constants.GriceryAppconstants;
import com.shadab.grocery.exceptions.SoldItemOutOfStockException;
import com.shadab.grocery.models.GroceryRootContext;
import com.shadab.grocery.models.InMemoryStorage;
import com.shadab.grocery.models.Item;
import com.shadab.grocery.models.sale.Transaction;
import com.shadab.grocery.util.GroceryUtility;

/**
 * @author mshadab
 *
 */
@Service
public class GroceryOperationServiceImpl implements GroceryOperationService{

	@Autowired
	InMemoryStorage inMemoryStorage;
	
	
	
	/* <map>
     <entry key = "Soda" value = "Beverages"/>
     <entry key = "Cofee" value = "Beverages"/>
     <entry key = "Tea" value = "Beverages"/>
     <entry key = "Sandwich" value = "Bakery"/>
     <entry key = "Roll" value = "Bakery"/>
     <entry key = "Bagels" value = "Bakery"/>
     <entry key = "Egg" value = "RefrigeratedFood"/>
     <entry key = "Cream" value = "RefrigeratedFood"/>
     <entry key = "Fage" value = "RefrigeratedFood"/>
  </map>
	*/
	
	private static final Logger logger = LoggerFactory.getLogger(GroceryOperationServiceImpl.class);

	
	@Override
	public void loadItemsInStore() {
		// TODO Auto-generated method stub
		Item item1 = new Item("Soda","item1bev", inMemoryStorage.getItemTypeMap().get("Soda").toString()
				,20, 25.5);
		Item item2 = new Item("Cofee","item2bev", inMemoryStorage.getItemTypeMap().get("Cofee").toString()
				,100, 10);
		Item item3 = new Item("Tea","item3bev", inMemoryStorage.getItemTypeMap().get("Tea").toString()
				,100, 15);
		Item item4 = new Item("Sandwich","item1bak", inMemoryStorage.getItemTypeMap().get("Sandwich").toString()
				,20, 40);
		Item item5 = new Item("Roll","item2bak", inMemoryStorage.getItemTypeMap().get("Roll").toString()
				,10, 70);
		Item item6 = new Item("Bagels","item3bak", inMemoryStorage.getItemTypeMap().get("Bagels").toString()
				,10, 10);
		Item item7 = new Item("Egg","item1ref", inMemoryStorage.getItemTypeMap().get("Egg").toString()
				,500, 5);
		Item item8 = new Item("Cream","item2ref", inMemoryStorage.getItemTypeMap().get("Cream").toString()
				,20, 20.75);
		Item item9 = new Item("Fage","item3ref", inMemoryStorage.getItemTypeMap().get("Fage").toString()
				,20, 25);
		
		// Beverages
		GroceryRootContext.items.put(item1.getItemUniqueCode(),item1);
		GroceryRootContext.items.put(item2.getItemUniqueCode(),item2);
		GroceryRootContext.items.put(item3.getItemUniqueCode(),item3);
		
		// Bakery Items
		
		GroceryRootContext.items.put(item4.getItemUniqueCode(),item4);
		GroceryRootContext.items.put(item5.getItemUniqueCode(),item5);
		GroceryRootContext.items.put(item6.getItemUniqueCode(),item6);
		
		// Refregerated Iitems
		
		GroceryRootContext.items.put(item7.getItemUniqueCode(),item7);
		GroceryRootContext.items.put(item8.getItemUniqueCode(),item8);
		GroceryRootContext.items.put(item9.getItemUniqueCode(),item9);
		
		logger.info("Total Item Loaded "+GroceryRootContext.items.size());
		
		logger.info("Clear transactions");
		GroceryRootContext.transactions.clear();

		
	}


	@Override
	public Transaction saleItem(String itemUniqueCode, String soldQuentity, String discountApplied) {
		// TODO Auto-generated method stub
		System.out.println("uniquecode is::::"+itemUniqueCode);
 		Item soldItem= new Item("", itemUniqueCode, "", 0, 0);
 		String itemName = GroceryRootContext.items.get(itemUniqueCode).getItemName();
 		String itemCategory = GroceryRootContext.items.get(itemUniqueCode).getItemName();
 		double unitPrice = GroceryRootContext.items.get(itemUniqueCode).getUnitPrice();
 		// item sold
 		Item soldItemtoupdate = GroceryRootContext.items.get(itemUniqueCode);
 		int availableQuantity = soldItemtoupdate.getItemQuantity();
 		int soldQuantity =  Integer.parseInt(soldQuentity);
 		double soldPrice=0.0;
 		double actuaPrice=0.0;
 		if(discountApplied.equalsIgnoreCase("none")) {
 			// no discount applied
 			actuaPrice = unitPrice*soldQuantity;
 			soldPrice = actuaPrice;
 		}
 		else {
 			// discount applied
 			logger.info("discountApplied :"+discountApplied);
 			int discountPercentage = Integer.parseInt(inMemoryStorage.getDiscounts().get(discountApplied).toString());
 		logger.info("Discount :"+inMemoryStorage.getDiscounts().get(discountApplied));
 			actuaPrice = unitPrice*soldQuantity;
 			logger.info("actuaPrice:"+actuaPrice);
 		  double discountedMoney= actuaPrice*discountPercentage/100;
 		 logger.info("discountedMoney:"+discountedMoney);
 		  soldPrice = actuaPrice - discountedMoney;
 		}
 		
 		boolean quantityCheck = false;
 		try {
			updateSoldItemInMemory(soldItemtoupdate, soldQuantity, availableQuantity);
			quantityCheck=true;
		} catch (SoldItemOutOfStockException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

 	Transaction transation = null; 
 	if(quantityCheck) {
 		// item is available
 	transation = new Transaction( itemName, itemUniqueCode,  itemCategory, soldQuantity, unitPrice,
			 discountApplied,  actuaPrice,   soldPrice,GriceryAppconstants.SUCCESS_STATUS,GriceryAppconstants.SUCCESS_REASON,GroceryUtility.getCurrentTimewithDate());
 	}
 	else {
 		// not available
 		transation = new Transaction( itemName, itemUniqueCode,  itemCategory, soldQuantity, unitPrice,
 				 discountApplied,  actuaPrice,   soldPrice,GriceryAppconstants.FAILED_STATUS,GriceryAppconstants.FAILED_REASON,GroceryUtility.getCurrentTimewithDate());
 		
 	}
 	
 	GroceryRootContext.transactions.add(transation);
 	
		
		return transation;
	}

	@Override
	public boolean updateSoldItemInMemory(Item item, int soldQuantity, int availableQuantity)
			throws SoldItemOutOfStockException {
		// TODO Auto-generated method stub
		
	synchronized (item) {
		if(soldQuantity>availableQuantity)
			throw new SoldItemOutOfStockException("Total available items are:"+availableQuantity+" And you are trying to sell :"+soldQuantity);
		else
		{
			item.setItemQuantity(availableQuantity-soldQuantity);
			return true;
		}
		
		
	}
	}
	
	

}

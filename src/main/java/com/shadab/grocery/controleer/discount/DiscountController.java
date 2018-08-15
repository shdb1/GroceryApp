/**
 * 
 */
package com.shadab.grocery.controleer.discount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.grocery.api.DiscountApi;
import com.shadab.grocery.models.InMemoryStorage;
import com.shadab.grocery.models.discount.Discount;
import com.shadab.grocery.models.discount.DiscountResponse;

/**
 * @author mshadab
 *
 */
@RestController
public class DiscountController implements DiscountApi {
	
	@Autowired
	InMemoryStorage inMemoryStorage;
	@Autowired
	DiscountResponse discountResponse;
	
	private static final Logger logger = LoggerFactory.getLogger(DiscountController.class);

	@Override
	public DiscountResponse getDiscount() {
		// TODO Auto-generated method stub
		discountResponse.setDiscount(formDiscountResponse());
		return discountResponse;
	}

	
	public List<Discount> formDiscountResponse(){
		
		List<Discount> dscountList = new ArrayList<Discount>();
		Map  discounts=inMemoryStorage.getDiscounts();
		Iterator<Map.Entry<String, String>> iterator = discounts.entrySet().iterator();
		while(iterator.hasNext()) {
			
			Map.Entry<String, String> pair = iterator.next();
			dscountList.add(new Discount(pair.getKey(),pair.getValue()+" % discount on total purchase"));
		    
		}

		
		return dscountList;
	}	
	}



/**
 * 
 */
package com.shadab.grocery.models.discount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shadab.grocery.models.InMemoryStorage;

/**
 * @author mshadab
 *
 */

@Component
public class DiscountResponse {
	
	List<Discount> discount;

	public List<Discount> getDiscount() {
		return discount;
	}

	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}
	

}

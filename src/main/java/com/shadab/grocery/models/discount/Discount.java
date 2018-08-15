/**
 * 
 */
package com.shadab.grocery.models.discount;

import org.springframework.stereotype.Component;

/**
 * @author mshadab
 *
 */

public class Discount {

	private String offerName;
	public Discount(String offerName, String offerInPercentage) {
		super();
		this.offerName = offerName;
		this.offerInPercentage = offerInPercentage;
	}
	private String offerInPercentage;
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferInPercentage() {
		return offerInPercentage;
	}
	public void setOfferInPercentage(String offerInPercentage) {
		this.offerInPercentage = offerInPercentage;
	}
	
}

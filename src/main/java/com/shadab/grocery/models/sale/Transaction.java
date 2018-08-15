/**
 * 
 */
package com.shadab.grocery.models.sale;

/**
 * @author mshadab
 *
 */
public class Transaction {
	
	
	private String itemName;
	private String itemUniqueCode;
	private String itemCategory;
	private double soldQuantity;
	private double unitPrice;
	private String discountApplied;
	private double actuaPrice;
	private double soldPrice;
	private String status;
    private String reason;
    private String transactionTime;
	
	
	public Transaction(String itemName, String itemUniqueCode, String itemCategory, double soldQuantity, double unitPrice,
			String discountApplied,double actuaPrice, double soldPrice,String status,String reason, String transactiontime) {
		super();
		this.itemName = itemName;
		this.itemUniqueCode = itemUniqueCode;
		this.itemCategory = itemCategory;
		this.soldQuantity = soldQuantity;
		this.unitPrice = unitPrice;
		this.discountApplied = discountApplied;
		this.actuaPrice= actuaPrice;
		this.soldPrice = soldPrice;
		this.status=status;
		this.reason=reason;
		this.transactionTime=transactiontime;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemUniqueCode() {
		return itemUniqueCode;
	}
	public void setItemUniqueCode(String itemUniqueCode) {
		this.itemUniqueCode = itemUniqueCode;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public double getSoldQuantity() {
		return soldQuantity;
	}
	public void setSoldQuantity(double soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String isDiscountApplied() {
		return discountApplied;
	}
	public void setDiscountApplied(String discountApplied) {
		this.discountApplied = discountApplied;
	}
	public double getSoldPrice() {
		return soldPrice;
	}
	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}
	public double getActuaPrice() {
		return actuaPrice;
	}
	public void setActuaPrice(double actuaPrice) {
		this.actuaPrice = actuaPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getDiscountApplied() {
		return discountApplied;
	}
}

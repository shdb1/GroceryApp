/**
 * 
 */
package com.shadab.grocery.models;

/**
 * @author mshadab
 *
 */
public class Item {
	
	
	private String itemName;
	private String itemUniqueCode;
	private String itemCategory;
	private int itemQuantity;
	private double unitPrice;
	public Item(String itemName,  String itemUniqueCode , String itemCategory, int itemQuantity, double unitPrice) {
		super();
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.itemQuantity = itemQuantity;
		this.unitPrice = unitPrice;
		this.itemUniqueCode = itemUniqueCode;
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
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hashcode=0;
 		hashcode= itemUniqueCode.hashCode();
		return hashcode;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Item) {
			Item item = (Item)obj;
			return (item.itemUniqueCode.equals(this.itemUniqueCode));
			
		}
		else {
			return false;
		}
	}
*/
}

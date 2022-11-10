package com.asc.model;

public class Item {
	private int itemId;
	private String itemName;
	private String sub_category;
	private String brand;
	private int sale_price;
	private int market_price;
	public Item() {
		super();
	}
	public Item(int itemId, String itemName, String sub_category, String brand, int sale_price, int market_price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.sub_category = sub_category;
		this.brand = brand;
		this.sale_price = sale_price;
		this.market_price = market_price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSub_category() {
		return sub_category;
	}
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public int getMarket_price() {
		return market_price;
	}
	public void setMarket_price(int market_price) {
		this.market_price = market_price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", sub_category=" + sub_category + ", brand="
				+ brand + ", sale_price=" + sale_price + ", market_price=" + market_price + "]";
	}
	
	
}

package com.prsolutions.freshveggiesshops.model;

public class Shopping {

	private int vegetableId;
	private String shopName;
	private String shopContact;
	private String vegetableQuantity;
	private int vegetablePrice;
	
	public Shopping(int vegetableId, String shopName, String shopContact, String vegetableQuantity,
			int vegetablePrice) {
		super();
		this.vegetableId = vegetableId;
		this.shopName = shopName;
		this.shopContact = shopContact;
		this.vegetableQuantity = vegetableQuantity;
		this.vegetablePrice = vegetablePrice;
	}
	
	public int getVegetableId() {
		return vegetableId;
	}
	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopContact() {
		return shopContact;
	}
	public void setShopContact(String shopContact) {
		this.shopContact = shopContact;
	}
	
	public String getVegetableQuantity() {
		return vegetableQuantity;
	}

	public void setVegetableQuantity(String vegetableQuantity) {
		this.vegetableQuantity = vegetableQuantity;
	}

	public int getVegetablePrice() {
		return vegetablePrice;
	}

	public void setVegetablePrice(int vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}

	@Override
	public String toString() {
		return "Shopping [vegetableId=" + vegetableId + ", shopName=" + shopName + ", shopContact=" + shopContact
				+ ", vegetableQuantity=" + vegetableQuantity + ", vegetablePrice=" + vegetablePrice + "]";
	}
}

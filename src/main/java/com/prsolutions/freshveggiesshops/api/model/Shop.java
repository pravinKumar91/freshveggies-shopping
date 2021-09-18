package com.prsolutions.freshveggiesshops.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")
public class Shop {
		
	public Shop() {
		super();
	}

	@Id
	@SequenceGenerator(
			name = "shop_sequence",
			sequenceName = "shop_sequence",
			allocationSize = 1
		)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "shop_sequence"
	)
	private long shopId;
	
	private String shopName;
	private String shopContact;
	private int shopPinCode;
	
	public Shop(long shopId, String shopName, String shopContact, int shopPinCode) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopContact = shopContact;
		this.shopPinCode = shopPinCode;
	}
	
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
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

	public int getShopPinCode() {
		return shopPinCode;
	}

	public void setShopPinCode(int shopPinCode) {
		this.shopPinCode = shopPinCode;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopContact=" + shopContact + ", shopPinCode="
				+ shopPinCode + "]";
	}
}

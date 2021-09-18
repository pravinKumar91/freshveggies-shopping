package com.prsolutions.freshveggiesshops.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsolutions.freshveggies.api.service.ShoppingService;
import com.prsolutions.freshveggiesshops.api.model.Shop;

@RestController
@RequestMapping("/shop")
public class ShoppingController {
	
	@Autowired
	public ShoppingService shoppingService;	

	@RequestMapping("/{veggiId}")
	public Shop getShop(@PathVariable("veggiId") int veggiId) {
		return new Shop(1,"Kamal Mart, Jambe", "8700000000",411046);
	}
	
	@RequestMapping("/{pincode}")
	public List<Shop> getShopsByPinCode(@PathVariable("pincode") int pincode) {
		List<Shop> listShops = shoppingService.getAllShops();
		return listShops.stream().filter(shop ->shop.getShopPinCode()==pincode).collect(Collectors.toList());
	}
}

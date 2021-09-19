package com.prsolutions.freshveggiesshops.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsolutions.freshveggiesshops.api.model.Shop;
import com.prsolutions.freshveggiesshops.api.service.ShoppingService;

@RestController
@RequestMapping("/shop")
public class ShoppingController {
		
	@Autowired
	public ShoppingService shoppingService;	

	@RequestMapping("/id/{shopId}")
	public Shop getShop(@PathVariable("shopId") long shopId) {
		return shoppingService.getShop(shopId);
	}
	
	@RequestMapping("/name/{shopName}")
	public List<Shop> getShop(@PathVariable("shopName") String shopName) {
		return shoppingService.getShopByName(shopName);
	}
	
	@RequestMapping("/location/{pincode}")
	public List<Shop> getShopsByPinCode(@PathVariable("pincode") int pincode) {
		List<Shop> listShops = shoppingService.getAllShops();
		return listShops.stream().filter(shop ->shop.getShopPinCode()==pincode).collect(Collectors.toList());
	}
	
	@PostMapping("/add/newshop")
	public Shop addShop(@RequestBody Shop shop) {
		System.out.println("Shop added sucessfully.");
		return shoppingService.addShop(shop);
	}
}

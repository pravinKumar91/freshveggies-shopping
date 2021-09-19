package com.prsolutions.freshveggiesshops.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prsolutions.freshveggiesshops.api.dao.ShoppingRepository;
import com.prsolutions.freshveggiesshops.api.model.Shop;

@Service
public class ShoppingService {
	
	@Autowired
	public ShoppingRepository shoppingRepository;
	
	/**
	 * this method will get the all shops available in database
	 * @author pravinK
	 * @return
	 */
	public List<Shop> getAllShops() {
		List<Shop> listShops = shoppingRepository.findAll();
		return listShops;
	}
	
	/**
	 * this method will save the new shop in the list
	 * @author pravinK
	 * @param shop
	 * @return
	 */
	public Shop addShop(Shop shop) {
		return shoppingRepository.save(shop);
	}
	
	public Shop getShop(long shopId) {
		return shoppingRepository.findById(shopId).get();
	}
	
	public long getAllRecordCount() {
		return shoppingRepository.count();
	}
}

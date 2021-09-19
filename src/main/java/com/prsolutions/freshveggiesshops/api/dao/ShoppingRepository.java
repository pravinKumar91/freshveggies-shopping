package com.prsolutions.freshveggiesshops.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prsolutions.freshveggiesshops.api.model.Shop;

@Repository
public interface ShoppingRepository extends JpaRepository<Shop, Long>{
//	List<Shop> findByShopPinCode(int shopPinCode);
}

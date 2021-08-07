package com.prsolutions.freshveggiesshops.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsolutions.freshveggiesshops.model.LocationShops;
import com.prsolutions.freshveggiesshops.model.Shopping;

@RestController
@RequestMapping("/shopping")
public class ShoppingCentres {

	@RequestMapping("/{veggiId}")
	public Shopping getShopping(@PathVariable("veggiId") int veggiId) {
		return new Shopping(veggiId, "Kamal Mart, Jambe", "8700000000","1 KG", 20);
	}
	
	@RequestMapping("/locations/{locationId}")
	public LocationShops getLocationShops(@PathVariable("locationId") int locationId) {
		List<Shopping> listShops = Arrays.asList(
				new Shopping(10, "Kamal Mart, Jambe", "8700000000","1 KG",30),
				new Shopping(11, "Swastik Vegetables, Hinjewadi", "8600000000","500 Gram", 25),
				new Shopping(13, "New Poona vegetables, Marunji", "8500000000","12 in counts",50)
				);
		LocationShops locationShops = new LocationShops();
		locationShops.setListShops(listShops);
		return locationShops;
	}
}

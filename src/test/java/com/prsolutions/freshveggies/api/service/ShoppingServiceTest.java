package com.prsolutions.freshveggies.api.service;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.prsolutions.freshveggiesshops.api.dao.ShoppingRepository;
import com.prsolutions.freshveggiesshops.api.model.Shop;
import com.prsolutions.freshveggiesshops.api.service.ShoppingService;


public class ShoppingServiceTest {

	@Autowired
	public ShoppingService shoppingService;
	
	@MockBean
	public ShoppingRepository shoppingRepository;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAllShops() {
		when(shoppingRepository.findAll()).thenReturn(Stream.of(new Shop(10, "Kamal Mart, Jambe", "8700000000",411057),
				new Shop(11, "Swastik Vegetables, Hinjewadi", "8600000000",411057)).collect(Collectors.toList()));			
		assertEquals(2, shoppingRepository.findAll());
	}

	@Test
	public void testAddShop() {
		fail("Not yet implemented");
	}

}

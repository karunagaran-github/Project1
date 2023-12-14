package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase5 extends Sewrappers1 {

	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();
	
	
	//code to select and add an item from (Menu à brand).
	
	@Test
	public void menu_searchByBrand() throws InterruptedException{
		
		report1.setTCDesc("Validating best buy search by brand and add to cart");
		launchBrowser("https://www.bestbuy.com/");
		
		B1.menu_shopByBrands();
}
}

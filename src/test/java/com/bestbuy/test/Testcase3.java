package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase3 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();

	//code to search for and add an item to the shopping cart
	
	@Test
	public void searchBox_AddtoCart() throws InterruptedException{
		
			report1.setTCDesc("Validating best buy search results and add to cart");
			launchBrowser("https://www.bestbuy.com/");
			
			B1.searchBox("pendrive");
			

}
}
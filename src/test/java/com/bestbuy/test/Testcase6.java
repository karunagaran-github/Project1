package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase6 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();
	
	//code to navigate to the checkout page and fill out the form with dummy payment information
	
	@Test
	public void byCheckout() throws InterruptedException{
		
		report1.setTCDesc("Validating best buy item to checkout");
		launchBrowser("https://www.bestbuy.com/");
		
		B1.checkOut("ashwinshre@gmail.com","Ashwin@99");
		closeAllBrowsers();

}

}

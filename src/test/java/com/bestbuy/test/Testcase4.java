package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase4 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();
	
	
	//code to search for and add an item to the shopping cart
	
	@Test
	public void menu_searchByDepartment() throws InterruptedException{
		
		report1.setTCDesc("Validating best buy search by department and add to cart");
		launchBrowser("https://www.bestbuy.com/");
		
		B1.menu_shopByDepartment();
		

}
	

}

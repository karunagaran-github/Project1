package com.bestbuy.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;


import com.bestbuy.utils.Sewrappers1;


public class Testcase8 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();

	//code to open a web browser and navigate to the Best Buy e-commerce website and SIGNUP
	
	@Test
	public void allMenus() throws InterruptedException{
		
			report1.setTCDesc("Validating best buy link and signup");
			launchBrowser("https://www.bestbuy.com/");
			B1.allMenus();
			
			
			
			
	}
}

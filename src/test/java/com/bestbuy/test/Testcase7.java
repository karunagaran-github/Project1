package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase7 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();
	
	//code to validate if the given URL Link is broken
	@Test
	public void brokenLinkTest() throws InterruptedException{
		
		report1.setTCDesc("Validating best buy url");
		launchBrowser("https://www.bestbuy.com/");
		validateLink("https://www.bestbuy.com/");
		
}
}
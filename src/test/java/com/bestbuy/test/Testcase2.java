package com.bestbuy.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.SigninPage;
import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase2 extends Sewrappers1 {
	
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();

	// code to do Signin functionality.
	
	@Test
	public void signinTest() throws InterruptedException{
		
			report1.setTCDesc("Validating signin");
			launchBrowser("https://www.bestbuy.com/");
			B1.launching();
			B1.Signin("karunagaranelango@gmail.com","Nine+Twelve=21");
			
			
			
	}
	

}
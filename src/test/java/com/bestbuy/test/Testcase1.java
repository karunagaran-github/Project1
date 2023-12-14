package com.bestbuy.test;



import org.testng.annotations.Test;


import com.bestbuy.utils.BBreports;
import com.bestbuy.utils.BestBuywrappers;
import com.bestbuy.utils.Sewrappers1;

public class Testcase1 extends Sewrappers1{
	
	BestBuywrappers B1= new BestBuywrappers();
	BBreports report1 = new BBreports();

	//code to open a web browser and navigate to the Best Buy e-commerce website and SIGNUP
	
	@Test
	public void browserTest() throws InterruptedException{
		
			report1.setTCDesc("Validating best buy link and signup");
			launchBrowser("https://www.bestbuy.com/");
			B1.signup("karunagaran1","Elango","ashwinshre@gmail.com","Ashwin@99","Ashwin@99","6369993021");
			//B1.test2("e.karunagaran.com","Nine+Twelve=21");
			System.out.println("Success");
			
	}
	

}

package com.bestbuy.utils;

import org.openqa.selenium.support.PageFactory;

import com.bestbuy.pages.AllmenusPage;
import com.bestbuy.pages.CartPage;
import com.bestbuy.pages.CreateAccountPage;
import com.bestbuy.pages.HomePage1;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.SearchPage;
import com.bestbuy.pages.SigninPage;

public class BestBuywrappers extends Sewrappers1{
	
	
	public void launching() {
	HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
	 
	homePage1.clickCountry();
	homePage1.clickAccount();
	homePage1.clickCreateAcc();
	}
	
	
	public void signup(String firstname, String lastname, String email, String pwd, String conpwd, String ph) {	
		
	CreateAccountPage Acc = PageFactory.initElements( driver,CreateAccountPage.class);
	HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
	 
	homePage1.clickCountry();
	homePage1.clickAccount();
	homePage1.clickCreateAcc();
	Acc.firstnameClick(firstname);
	Acc.lastnameClick(lastname);
	Acc.emailClick(email);
	Acc.passwordClick(pwd);
	System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
	Acc.conpasswordClick(conpwd);
	Acc.phoneClick(ph);
	Acc.cphoneClick();
	Acc.submitClick();
	}

	public void Signin(String lmail,String lpwd) {
	SigninPage signin = PageFactory.initElements( driver,SigninPage.class);
	
	
	signin.sendEmail(lmail);
	signin.sendpwd(lpwd);
	signin.loginsub();
	
	}
	
	public void searchBox(String search) {
		HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
		SearchPage searchpage1= PageFactory.initElements( driver,SearchPage.class);
		homePage1.clickCountry();
		homePage1.clicksearch(search);
		homePage1.clicksearchicon();
		searchpage1.clickItem1();
		searchpage1.clickaddcart();
				
		
	}
	
	public void menu_shopByDepartment() {
		HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
		Menu menu1 = PageFactory.initElements( driver,Menu.class);
		homePage1.clickCountry();
		menu1.clickmenu();
		menu1.clickAppliance();
		menu1.clickWasher();
		menu1.clickGasitem();
		menu1.clickGasitem1();
		menu1.clickItemcart1();
		
		
		
	}
	
	public void menu_shopByBrands() {
		HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
		Menu menu1 = PageFactory.initElements( driver,Menu.class);
		homePage1.clickCountry();
		menu1.clickmenu();
		menu1.clickBrand();
		menu1.clickBrandname();
		menu1.clickBranditem();
		menu1.clickBranditemCart();
	}
	
	public void checkOut(String lmail, String lpwd) {
		HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
		Menu menu1 = PageFactory.initElements( driver,Menu.class);
		CartPage cartpage = PageFactory.initElements( driver,CartPage.class);
		SigninPage signin = PageFactory.initElements( driver,SigninPage.class);

		homePage1.clickCountry();
		menu1.clickmenu();
		menu1.clickBrand();
		menu1.clickBrandname();
		menu1.clickBranditem();
		menu1.clickBranditemCart();
		cartpage.clickCarticon();
		cartpage.clickCheck_out();
		signin.sendEmail(lmail);
		signin.sendpwd(lpwd);
		signin.loginsub();
		signin.captureScreenshot("screenshotA");
		
		
	}
	
	public void allMenus() {
		
		//all menus
		HomePage1 homePage1 = PageFactory.initElements( driver,HomePage1.class);
		AllmenusPage allmenus = PageFactory.initElements( driver,AllmenusPage.class);
		homePage1.clickCountry();
		allmenus.clickHolidaymenu();
		String holiday= driver.getTitle();
		System.out.println(holiday);
		navigateBack();
		allmenus.clickGiftcard();
		String giftcard= driver.getTitle();
		System.out.println(giftcard);
		navigateBack();
		allmenus.clickGiftideas();
		String giftideas= driver.getTitle();
		System.out.println(giftideas);
		navigateBack();
		allmenus.clickTopideas();
		String topideas= driver.getTitle();
		System.out.println(topideas);
		navigateBack();
		
	
		
	}
	}


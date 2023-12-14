package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class CartPage extends Sewrappers1{
	
	//span[@class='cart-label']
	//button[@data-track='Checkout - Top']
	
	@FindBy(xpath="//span[@class='cart-label']")
	public WebElement Cart;
	
	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	public WebElement CheckOut;
	
	public void clickCarticon() {
		waitForElement(Cart,20);
		clickElement(Cart);
	}
	
	public void clickCheck_out() {
		waitForElement(CheckOut,20);
		clickElement(CheckOut);
	}
	
	

}

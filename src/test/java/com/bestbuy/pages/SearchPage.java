package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class SearchPage extends Sewrappers1{
	
	@FindBy(linkText="SanDisk - Ultra 512GB USB 3.0 Flash Drive - Black")
	public WebElement item1;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	public WebElement AddCart;
	
	public void clickItem1() {
		waitForElement(item1,20);
		clickElement(item1);
	}
	
	public void clickaddcart() {
		waitForElement(AddCart,20);
		clickElement(AddCart);
	}
}

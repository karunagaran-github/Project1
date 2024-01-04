package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class HomePage1 extends Sewrappers1 {
	
	@FindBy(partialLinkText="United States")
	public WebElement country;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	public WebElement account;
	
	@FindBy(partialLinkText="Create Account")
	public WebElement createAcc;
	
	
	@FindBy(linkText="Sign In")
	public WebElement signin;
	
	@FindBy(id="gh-search-input")
	public WebElement Search;
	
	@FindBy(xpath="//button[@title='submit search']")
	public WebElement searchicon;
	
	
	
	
	
	
	public void clickCountry() {
		waitForElement(country,20);
		clickElement(country);
	}
	
	public void clickAccount() {
		waitForElement(account,20);
		clickElement(account);
	}
	
	public void clickCreateAcc() {
		waitForElement(createAcc,20);
		clickElement(createAcc);
	}
	
	public void clicksignin() {
		waitForElement(signin,20);
		clickElement(signin);
	}
	
	public void clicksearch(String se) {
		waitForElement(Search,20);
		typeText(Search,se);
	}
	
	public void clicksearchicon() {
		waitForElement(searchicon,20);
		clickElement(searchicon);
	}
	
	

}

package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class Menu extends Sewrappers1{
	
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	public WebElement Menu;
	
	@FindBy(xpath="//button[text()='Appliances']")
	public WebElement Appliance;
	
	@FindBy(xpath="//button[text()='Washers & Dryers']")
	public WebElement Washer;
	
	@FindBy(linkText="Gas Dryers")
	public WebElement Gasitem;
	
	@FindBy(partialLinkText="GE - 6.2 Cu. Ft. Gas Dryer - White")
	public WebElement Gasitem1;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	public WebElement Itemcart1;
	
	@FindBy(xpath ="//button[text()='Brands']")
	public WebElement Brand;
	
	@FindBy(xpath ="//a[text()='PlayStation']")
	public WebElement Brandname;
	
	@FindBy(xpath="//span[text()='Sony - $10 PlayStation Store Card [Digital]']")
	public WebElement Branditem;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	public WebElement BranditemCart;
	
	
	
	
	
	
	public void clickmenu() {
		waitForElement(Menu,20);
		clickElement(Menu);
	}
	
	public void clickAppliance() {
		waitForElement(Appliance,20);
		clickElement(Appliance);
	}
	
	public void clickGasitem() {
		waitForElement(Gasitem,20);
		clickElement(Gasitem);
	}
	
	public void clickWasher() {
		waitForElement(Washer,20);
		clickElement(Washer);
	}
	
	public void clickGasitem1() {
		waitForElement(Gasitem1,20);
		clickElement(Gasitem1);
	}
	
	public void clickItemcart1() {
		waitForElement(Itemcart1,20);
		clickElement(Itemcart1);
	}
	
	public void clickBrand() {
		waitForElement(Brand,20);
		clickElement(Brand);
	}
	
	public void clickBrandname() {
		waitForElement(Brandname,20);
		clickElement(Brandname);
	}
	
	public void clickBranditem() {
		waitForElement(Branditem,20);
		clickElement(Branditem);
	}
	
	public void clickBranditemCart() {
		waitForElement(BranditemCart,20);
		clickElement(BranditemCart);
	}

}

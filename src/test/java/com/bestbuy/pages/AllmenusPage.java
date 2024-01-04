package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class AllmenusPage extends Sewrappers1{
	
	@FindBy(xpath="//a[@data-lid='hdr_holdeals']")
	public WebElement Holidaymenu;
	
	@FindBy(xpath="//a[@data-lid='hdr_gift_cards']")
	public WebElement Giftcard;
	
	@FindBy(xpath="//a[@data-lid='hdr_gift_ideas']")
	public WebElement Giftideas;
	
	@FindBy(xpath="//a[@data-lid='hdr_td_topdeals']")
	public WebElement Topideas;
	
	@FindBy(xpath="//a[@data-lid='hdr_dotd']")
	public WebElement DealofDay;
	
	
	
	public void clickHolidaymenu() {
		
		waitForElement(Holidaymenu,20);
		clickElement(Holidaymenu);
		
	}
	
public void clickGiftcard() {
		
		waitForElement(Giftcard,20);
		clickElement(Giftcard);
		
	}

public void clickGiftideas() {
	
	waitForElement(Giftideas,20);
	clickElement(Giftideas);
	
}

public void clickTopideas() {
	
	waitForElement(Topideas,20);
	clickElement(Topideas);
	
}

public void clickDealofDay() {
	
	waitForElement(DealofDay,20);
	clickElement(DealofDay);
	
}



}

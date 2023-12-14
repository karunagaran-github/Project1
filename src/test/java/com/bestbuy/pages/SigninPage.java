package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class SigninPage extends Sewrappers1 {
	
	@FindBy(xpath="//input[@id='fld-e']")
	public WebElement mail;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement loginpwd;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Sub;
	
	public void sendEmail(String subemail) {
		waitForElement(mail,20);
		typeText(mail,subemail);	
	}
	
	public void sendpwd(String subpwd) {
		waitForElement(loginpwd,20);
		typeText(loginpwd,subpwd);	
	}
	
	public void loginsub() {
		waitForElement(Sub,20);
		clickElement(Sub);	
	}
	
	
	
	
	
	

}

package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers1;

public class CreateAccountPage extends Sewrappers1 {
	
	@FindBy(id ="firstName")
	public WebElement Firstname;
	
	@FindBy(id="lastName")
	public WebElement Lastname;
	
	@FindBy(id="email")
	public WebElement Email;
	
	@FindBy(xpath="//input[@name='fld-p1']")
	public WebElement Password;
	
	@FindBy(id="reenterPassword")
	public WebElement Cpassword;
	
	@FindBy(id="phone")
	public WebElement Phone;
	
	@FindBy(id="is-recovery-phone")
	public WebElement Cphone;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Submit;
	
	public void firstnameClick(String first) {
		waitForElement(Firstname,20);
		typeText(Firstname,first);	
	}
	
	public void lastnameClick(String last) {
		waitForElement(Lastname,20);
		typeText(Lastname,last);	
	}
	
	public void emailClick(String email ) {
		waitForElement(Email,20);
		typeText(Email,email);	
	}
	
	public void passwordClick(String pw) {
		waitForElement(Password,20);
		typeText(Password,pw);	
	}
	
	public void conpasswordClick(String cpw) {
		waitForElement(Cpassword,20);
		typeText(Cpassword,cpw);	
	}
	
	public void phoneClick(String mob) {
		waitForElement(Phone,20);
		typeText(Phone,mob);	
	}
	
	public void cphoneClick() {
		waitForElement(Cphone,20);
		clickElement(Cphone);	
	}
	
	public void submitClick() {
		waitForElement(Submit,20);
		clickElement(Submit);	
	}
	
	
	

}

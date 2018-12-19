package com.terminus.pageHelper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.terminus.pageObjects.LoginPageObject;


public class LoginPageHelper extends LoginPageObject {

	public LoginPageHelper(WebDriver driver) {
		super(driver);
	
	}

	public void Enter_Invalid_UserNamePassword() throws InterruptedException{
		Thread.sleep(5000);
		userNameField.sendKeys("test");
		passwordField.sendKeys("abc");

		
}
	
	public  void Catch_ValidationMessage() throws InterruptedException {
		loginButton.click();
		Thread.sleep(7000);
	String ExpectedMessage = "Please enter correct Username or Password";
	
	Assert.assertEquals(validationmessage, ExpectedMessage);
	}
	
	public void Enter_valid_UserNamePassword() throws InterruptedException {
		Thread.sleep(5000);
		userNameField.sendKeys(prop.getProperty("username"));
		passwordField.sendKeys(prop.getProperty("password"));

		loginButton.click();
		
	}
	}


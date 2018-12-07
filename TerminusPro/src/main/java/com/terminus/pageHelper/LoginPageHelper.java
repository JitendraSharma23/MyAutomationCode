package com.terminus.pageHelper;

import org.openqa.selenium.WebDriver;

import com.terminus.pageObjects.LoginPageObject;

public class LoginPageHelper extends LoginPageObject {

	public LoginPageHelper(WebDriver driver) {
		super(driver);
	
	}

	public void Enter_Invalid_UserNamePassword(){
		userNameField.sendKeys("test");
		passwordField.sendKeys("abc");

		loginButton.click();
}
	public  boolean Catch_Alert() {
		
		return Alertmsg.isDisplayed();
		
	//	System.out.println(Alertmsg);
	//Alertmsg.getText();
	//Assert.assertEquals(Alertmsg.getText().compareTo("Please enter correct Username or Password"), true);
	}
	public void Enter_valid_UserNamePassword() throws InterruptedException {
		Thread.sleep(5000);
		userNameField.sendKeys(prop.getProperty("username"));
		passwordField.sendKeys(prop.getProperty("password"));

		loginButton.click();
		
	}
	}


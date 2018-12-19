package com.terminus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.terminus.utils.DriverInvocationClass;

public class LoginPageObject extends DriverInvocationClass {
	

		WebDriver driver;
		//CREATED PARAMETERIZED CONSTRUCTOR AND PASSING DRIVER INTO IT
		public LoginPageObject(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		protected @FindBy(xpath="//input[@id = 'logintxtUserName']")
	 
		WebElement userNameField;
		protected @FindBy(xpath="//input[@id = 'logintxtPassword']") 
		WebElement passwordField;
		protected @FindBy(xpath = "//input[@class='loginSubmitBtn']") 
		WebElement loginButton;
		
		protected @FindBy(xpath = "//input[@id=\"footerpnl\"]/div.getText()")   //*[@id="footerpnl"]/div
		 String validationmessage;
	}
		








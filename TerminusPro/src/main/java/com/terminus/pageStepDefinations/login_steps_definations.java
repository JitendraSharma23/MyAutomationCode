package com.terminus.pageStepDefinations;

import com.terminus.utils.DriverInvocationClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login_steps_definations extends DriverInvocationClass
{
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
	initialization();
	}

	@Given("^user enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws InterruptedException  {
	login.Enter_Invalid_UserNamePassword();
	
	}

	@Then("^login unsucessful$")
	public void login_unsucessful() throws InterruptedException  {
		login.Catch_ValidationMessage();
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		
		closeBrowser();
		
	}

	@Given("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws InterruptedException  {
		login.Enter_valid_UserNamePassword();
	}

	@Then("^login sucessful$")
	public void login_sucessful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



}

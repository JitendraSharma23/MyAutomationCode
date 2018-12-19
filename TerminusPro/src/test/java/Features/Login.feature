###########################################
Feature: Verify Login functionality
Background: 
Given user is on login page

@Smoke
Scenario: Verify user should not be able to login with invalid credentials
And user enter invalid username and password
Then login unsucessful
Then Close the browser

@Smoke
Scenario: Verify user should able to login with valid credentials
And user enter valid username and password
Then login sucessful
Then Close the browser
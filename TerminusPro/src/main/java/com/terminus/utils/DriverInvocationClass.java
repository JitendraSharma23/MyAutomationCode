package com.terminus.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.terminus.pageHelper.LoginPageHelper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInvocationClass {

	//VARIABLE DECLARATION

	public WebDriver driver ;
	protected  Properties  prop ;
	protected String browserName="";
	protected String userName="";
	protected String password="";
	protected LoginPageHelper login;

	public DriverInvocationClass()      // created constructor of the class.
	{
		try

		{
			prop = new Properties();   // created object of properties class of java.
			FileInputStream fis = new FileInputStream("C:\\Users\\jksharma\\eclipse-workspace\\TerminusPro\\src\\main\\java\\com"
					+ "\\terminus\\config\\config.properties");
			prop.load(fis);
		}catch (IOException e) {
			e.getMessage();
		}
	}
@Before
	public void initialization() throws InterruptedException                           
	{
		browserName = prop.getProperty("browser");
		userName =  prop.getProperty("username");
		password= prop.getProperty("password");

		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().version("2.40").setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			WebDriverManager.iedriver().arch32().setup();
			driver = new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("Driver not launched. Please check browser varibale or path");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(15000);
		driver.get(prop.getProperty("url"));
		login = new LoginPageHelper(driver);
	}
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for "
				+ "the Key:reportConfigPath");		
	}

	public void closeBrowser()
	{
		driver.quit();
	}	
}

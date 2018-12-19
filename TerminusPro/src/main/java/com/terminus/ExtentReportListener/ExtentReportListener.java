package com.terminus.ExtentReportListener;

import org.junit.Before;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.terminus.utils.DriverInvocationClass;

public class ExtentReportListener extends DriverInvocationClass {

	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");  
	}

	public void closeBrowser()
	{
		driver.quit();
	} 

	@Before
	public void setUp(Scenario scenario)
	{
	}

}


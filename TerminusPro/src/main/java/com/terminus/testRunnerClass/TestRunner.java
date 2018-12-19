package com.terminus.testRunnerClass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(

		features = "src/test/java/Features"
		,glue={"com.terminus.utils","com.terminus.pageStepDefinations"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-html-report.html",
				"pretty",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
		monochrome = false

		//tags="@Smoke"

		//dryRun = true
		)
public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent_config.xml"));
}
}




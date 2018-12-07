package com.terminus.testRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(

		features = "src/test/java/Features"
		,glue={"com.terminus.utils","com.terminus.pageStepDefinations"},
				plugin = { "pretty",
						"json:target/cucumber-reports/Cucumber.json",
					    "junit:target/cucumber-reports/Cucumber.xml",
					    "html:target/cucumber-reports"}
				
		//tags="@Smoke"
		
//dryRun = true
		)
public class TestRunner {
	
	}




package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report/FailedScenario.txt", 
				glue = "com\\adactin\\stepdefinition", 
				/*tags = {"@SmokeTest"},*/
				monochrome = true, 
				dryRun = false, 
				strict = true, 
				plugin = {/*"pretty", "html:Report/CucumberReport", "json:Report/Cucumber.json",*/
			"com.cucumber.listener.ExtentCucumberFormatter:RerunReport/CucumberExtentReport.html",
			"rerun:Report/FailedScenario.txt"})
public class TestRunnerRerun {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}

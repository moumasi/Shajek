package Shajek_testRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Shajek_utility.Shajek_base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Shajek_feature"},
plugin = {"json:target/cucumber.json"},
glue = "Shajek_stepDefination",tags = {"@Cookies"})

public class Shajek_TestRun extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void proStarturl() {
		Shajek_base Shaj = new Shajek_base();
		Shaj.ShBrowser();
	}
	@AfterTest
	public void proCloseurl() throws Exception {
		Thread.sleep(2000);
		Shajek_base Shaj = new Shajek_base();
		//Shaj.driver.quit();
	}
}

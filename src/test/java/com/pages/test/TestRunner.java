package com.pages.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"com.pages.stepdefs"})						
*/
@RunWith(Cucumber.class)
//@CucumberOptions(dryRun=true)
@CucumberOptions(
		monochrome=true,
		features="resources",
		glue={"com.pages.stepdefs","com.pages.test"},
		plugin= {"pretty", "html:target/Report/CucumberReport"}, 
		tags= {"@Home_Test1"}
		)
public class TestRunner {
	
	
 
}


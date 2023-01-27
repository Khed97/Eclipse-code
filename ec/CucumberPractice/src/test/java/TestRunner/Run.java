//package TestRunner;
//
//public class Run {
//
//}
package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

//import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
//		features = {".//Features/LoginFeature.feature",".//Features/Customers.feature"},
		features= {"src/test/java/Features"},
		glue="Stepdefinition",
		dryRun = false,
		monochrome = true,
	  //tags = "@Sanity",//scenarios under @sanity tag will be executed
		plugin = {"pretty","html:target/cucumber-reports"}
		)

//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Run {
	/*This class will be empty*/
}

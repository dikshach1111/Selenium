package cucumberOptions;

import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		//stepNotifications= true,
		strict = true,
		features = {"src/test/java/features/Login.feature"},
		glue = {"stepDefinations"})

public class TestRunner extends AbstractTestNGCucumberTests{

}


//remove comment of @Runwith and remove extends AbstractTestNGCucumberTests to convert into junit
//currently it is in testng
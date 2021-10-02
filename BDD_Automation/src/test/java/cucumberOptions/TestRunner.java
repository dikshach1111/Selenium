

package cucumberOptions;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications= true,
		strict = true,
		features = {"src/test/java/features/Login.feature"},
		glue = {"stepDefinations"})

public class TestRunner {

}

package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"/BDDProject99219922/Feature/Tagging.feature"},
		glue = {"stepDefinitions", "hooksPackage"},
		dryRun = false,
		monochrome=true
		//tags = "@RegressionTest"
	
		)

public class TestRunner {
	


}

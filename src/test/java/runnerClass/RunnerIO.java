package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\Login.feature",
		glue = "stepDefinitions",
		dryRun = false
// true - Not launch browser - check featureFiles and stepDefinitions bindings
// false - launch browser - run the step definitions 
		)

public class RunnerIO extends AbstractTestNGCucumberTests{

	
	
}
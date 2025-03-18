package week5.day2.runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= "src/test/resources/features/Login.feature",
		glue= "week5.day2.stepdefinitions",
		dryRun=false,
		publish=true, // to get cucumber report on web
		monochrome=true
		
		)

public class LoginRunnerclass extends AbstractTestNGCucumberTests{

	
	
}

package runner;

import org.testng.annotations.DataProvider;

import base.ProjectSpecificMethods;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(features = {"src/test/java/features/LeaftapsLogin.feature","src/test/java/features/CreateAccount.feature"}
,glue = {"pages"})

public class BDDLoginTC001 extends ProjectSpecificMethods {

	@DataProvider(parallel = true) //To execute cucumber testcases in parallel
    public Object[][] scenarios() {
		
		 return super.scenarios();
        
    }
	
}

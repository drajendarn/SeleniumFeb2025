package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class MyAccountPage extends ProjectSpecificMethods{
	
	@When("the user clicks the creat Account menu")
	public CreateAccountPage clickMyAccountsTab()
	{
		getRd().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
}

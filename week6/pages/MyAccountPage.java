package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods{
	
	public CreateAccountPage clickMyAccountsTab()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
}

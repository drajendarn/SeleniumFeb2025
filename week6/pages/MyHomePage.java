package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	
	public MyAccountPage clickAccountsTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}
	
	
}

package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {

	
	public MyHomePage clickCrmLink()
	{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}

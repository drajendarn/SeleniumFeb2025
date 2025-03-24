package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	
	
	public LoginPage enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys("democsr");
		return this;
	}
	public LoginPage enterPassword()
	{
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class HomePage extends ProjectSpecificMethods {


	
	@When("the user clicks the crsmfa link")
	public MyHomePage clickCrmLink()
	{
		getRd().findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}

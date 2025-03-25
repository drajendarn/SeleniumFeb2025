package pages;

import org.testng.Assert;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class ViewAccountPage extends ProjectSpecificMethods {
	
	@When("verify Account is created successfully")
	public ViewAccountPage verifyAccount()
	{
		String title = getRd().getTitle();
		
		String expTitle = "Account Details | opentaps CRM";
		Assert.assertEquals(title, expTitle,"Title Doesnot Matched!");
		return this;
	}

}

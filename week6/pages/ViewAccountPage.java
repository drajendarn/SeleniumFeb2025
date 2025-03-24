package pages;

import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods {
	
	public ViewAccountPage verifyAccount()
	{
		String title = driver.getTitle();
		
		String expTitle = "Account Details | opentaps CRM";
		Assert.assertEquals(title, expTitle,"Title Doesnot Matched!");
		return this;
	}

}

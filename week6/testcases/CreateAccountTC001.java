package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateAccountTC001 extends ProjectSpecificMethods
{
	@Test
	public void createAccount()
	{
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmLink()
		.clickAccountsTab()
		.clickMyAccountsTab()
		.enterAccountName()
		.enterDescription()
		.selectIndustryDropdown()
		.selectOwnershipDropdown()
		.selectSourceDropdown()
		.selectCampaignDropdown()
		.selectStateProvienceDropdown()
		.clickSubmit()
		.verifyAccount();
	}

	
}

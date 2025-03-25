package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class CreateAccountPage extends ProjectSpecificMethods {
	
	@When("Enter AccountName")
	public CreateAccountPage enterAccountName() {

		getRd().findElement(By.id("accountName")).sendKeys("TestAccount_xdivya002");// update this value everytime while
		// executing
		return this;
	}

	@When("Enter Description")
	public CreateAccountPage enterDescription() {
		getRd().findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}

	@When("Select Industry dropdown")
	public CreateAccountPage selectIndustryDropdown() {
// industry dropdown
		WebElement element = getRd().findElement(By.name("industryEnumId"));
		Select s = new Select(element);
		s.selectByValue("IND_SOFTWARE");
		return this;
	}

	@When("Select Ownership dropdown")
	public CreateAccountPage selectOwnershipDropdown() {
// ownership dropdown -selectByVisibleText
		WebElement element1 = getRd().findElement(By.name("ownershipEnumId"));
		Select s1 = new Select(element1);
		s1.selectByVisibleText("S-Corporation");
		return this;
	}

	@When("Select Source dropdown")
	public CreateAccountPage selectSourceDropdown() {
// Source dropdown -SelectByValue
		WebElement element2 = getRd().findElement(By.id("dataSourceId"));
		Select s2 = new Select(element2);
		s2.selectByValue("LEAD_EMPLOYEE");
		return this;
	}

	@When("Select Campagin dropdown")
	public CreateAccountPage selectCampaignDropdown() {
// marketing campaign dropdown -SelectByindexValue
		WebElement element3 = getRd().findElement(By.id("marketingCampaignId"));
		Select s3 = new Select(element3);
		s3.selectByIndex(5);
		return this;
	}

	@When("Select StateProvience dropdown")
	public CreateAccountPage selectStateProvienceDropdown() {
// stateprovience dropdown -
		WebElement element4 = getRd().findElement(By.id("generalStateProvinceGeoId"));
		Select s4 = new Select(element4);
		s4.selectByValue("TX");
		return this;
	}

	@When("Click Submit on Account page")
	public ViewAccountPage clickSubmitAccount() {
// click create account
		getRd().findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}
}

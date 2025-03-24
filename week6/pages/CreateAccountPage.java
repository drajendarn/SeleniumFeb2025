package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods {
	public CreateAccountPage enterAccountName() {

		driver.findElement(By.id("accountName")).sendKeys("TestAccount_divya1243");// update this value everytime while
		// executing
		return this;
	}

	public CreateAccountPage enterDescription() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}

	public CreateAccountPage selectIndustryDropdown() {
// industry dropdown
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select s = new Select(element);
		s.selectByValue("IND_SOFTWARE");
		return this;
	}

	public CreateAccountPage selectOwnershipDropdown() {
// ownership dropdown -selectByVisibleText
		WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
		Select s1 = new Select(element1);
		s1.selectByVisibleText("S-Corporation");
		return this;
	}

	public CreateAccountPage selectSourceDropdown() {
// Source dropdown -SelectByValue
		WebElement element2 = driver.findElement(By.id("dataSourceId"));
		Select s2 = new Select(element2);
		s2.selectByValue("LEAD_EMPLOYEE");
		return this;
	}

	public CreateAccountPage selectCampaignDropdown() {
// marketing campaign dropdown -SelectByindexValue
		WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
		Select s3 = new Select(element3);
		s3.selectByIndex(5);
		return this;
	}

	public CreateAccountPage selectStateProvienceDropdown() {
// stateprovience dropdown -
		WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s4 = new Select(element4);
		s4.selectByValue("TX");
		return this;
	}

	public ViewAccountPage clickSubmit() {
// click create account
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}
}

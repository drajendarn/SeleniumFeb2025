package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestAccount_divya1243");// update this value everytime while
																					// executing
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// industry dropdown
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select s = new Select(element);
		s.selectByValue("IND_SOFTWARE");
		// ownership dropdown -selectByVisibleText
		WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
		Select s1 = new Select(element1);
		s1.selectByVisibleText("S-Corporation");

		// Source dropdown -SelectByValue
		WebElement element2 = driver.findElement(By.id("dataSourceId"));
		Select s2 = new Select(element2);
		s2.selectByValue("LEAD_EMPLOYEE");

		// marketing campaign dropdown -SelectByindexValue
		WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
		Select s3 = new Select(element3);
		s3.selectByIndex(5);
		// stateprovience dropdown -
		WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s4 = new Select(element4);
		s4.selectByValue("TX");
		// click create account
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "Account Details | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title Not Matched");

		driver.close();

	}

}

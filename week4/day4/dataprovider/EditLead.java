package week4.day4.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditLead extends CommonMethods {
	
	@DataProvider(name="fetchData")

	public String[][] setupData() {
		String data[][] = new String[2][2];
		// row1
		data[0][0] = "98127";
		data[0][1] = "Testleaf";

		// row2
		data[1][0] = "98127";
		data[1][1] = "QEagle";
		
		
		return data;
	}

	@Test(dataProvider="fetchData")
	public void runEditLead(String phno,String cname) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		//Assert.assertEquals(text, cname, "Lead updated successfully"); //hardassert - stops the execution after failure
		//sort assert - Continues execution after failure
		//SoftAssert sa=new SoftAssert(); 
		//sa.assertEquals(text, cname, "Lead updated successfully");
		
		Assert.assertTrue(text.contains(cname));
		

	}

}

package week2.day1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "View Lead | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title Not Matched");

		driver.close();

	}

}

package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	ChromeDriver driver = new ChromeDriver();
	//String phoneNum = "9000010001";

	public void browserlaunch() {

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	public void createlead() throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("FnameLocal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Department");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Description");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("email@test.com");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		
		WebElement element4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s4 = new Select(element4);
		s4.selectByVisibleText("Alabama");
		Thread.sleep(1000);
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void editLead() throws InterruptedException {
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("update notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "View Lead | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title Not Matched");

		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		EditLead e=new EditLead();
		e.browserlaunch();
		e.createlead();
		e.editLead();

	}

}

package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	ChromeDriver driver = new ChromeDriver();
	String phoneNum = "9000010001";

	public void browserlaunch() {

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	public void createlead() throws InterruptedException {
		// Create lead with specific phone number
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNum);
		Thread.sleep(1000);
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void findlead() throws InterruptedException {
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// WebElement element =
		// driver.findElement(By.xpath("//td[contains(@class,'cell-first')]//a[1]"));
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a"));
		System.out.println("First Lead ID is :" + element.getText());
		Thread.sleep(2000);
		element.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		DeleteLead d = new DeleteLead();
		d.browserlaunch();
		d.createlead();
		d.findlead();

	}

}

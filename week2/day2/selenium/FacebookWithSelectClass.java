package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWithSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestFname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestLname");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pass@123");
		// day dropdown
		WebElement element = driver.findElement(By.id("day"));
		Select s = new Select(element);
		s.selectByValue("10");
		// Monthdropdown
		WebElement element1 = driver.findElement(By.id("month"));
		Select s1 = new Select(element1);
		s1.selectByVisibleText("Apr");

		// year dropdown
		WebElement element2 = driver.findElement(By.id("year"));
		Select s2 = new Select(element2);
		s2.selectByValue("1990");

		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		System.out.println("Reached last line without any issues");
		driver.close();
	}

}

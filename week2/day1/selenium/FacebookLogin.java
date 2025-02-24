package week2.day1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "Forgotten Password | Can't Log In | Facebook";
		if (title.equals(expTitle)) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title Not Matched");

		driver.close();
		
		

	}

}

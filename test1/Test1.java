package org.test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("My First code");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.testleaf.com/");
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("ml-2")).click();
		System.out.println("Test is complete");
		driver.quit();
		driver.close();
		Actions actions= new Actions(driver);
		actions.doubleClick(driver.findElement(By.className("ml-2")));
		actions.moveToElement(null);

	}

}

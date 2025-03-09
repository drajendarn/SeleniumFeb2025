package week3.day4.actionsclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


import dev.failsafe.internal.util.Durations;

public class AssAmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		//To open Incognito browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//launch amazon app Search for "oneplus 9 pro".
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).sendKeys(element, "oneplus 9 pro").click(search).perform();// sendkeys char seq is not working
		
		//Get the price of the first product
		String text = driver.findElement(By.xpath("(//span[contains(@class,'a-price-whole')])[2]")).getText();
		System.out.println("price of the first product :" + text );
		
		//Print the number of customer ratings for the first displayed product
		WebElement rating = driver.findElement(By.xpath("(//a[contains(@aria-label,'ratings')])[1]"));
		System.out.println("number of customer ratings for the first displayed product : " + rating.getText());
		
		//Click the first text link of the first image
		WebElement firstlink = driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-line-clamp-2 s-link-style a-text-normal')])[1]"));
		action.moveToElement(firstlink).click().perform();
		
		//Take a screenshot of the product displayed
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		String parentWindow=list.get(0);
		String childWindow=list.get(1);
		driver.switchTo().window(childWindow);
		
		Thread.sleep(1000);
		File src = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File des= new File("C:\\Users\\DIVYA\\Desktop\\Selenium Feb2025\\Selenium\\src\\main\\resources\\Snapshot\\Amazon.png");
		FileUtils.copyFile(src, des);
				
		//click on Add to cart
		WebElement addCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		action.moveToElement(addCart).click().perform();
		
		
		//Get cart subtotal
		String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);						
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cart subtotal : " + subTotal);//This returns blank value
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println("Test");
		driver.quit();

	}

}

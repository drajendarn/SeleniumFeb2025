package week3.day1.javacollectionsString;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssAjioList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@aria-label='search']")).click();

		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@id='Men']/parent::div")).click();

		// Under "Category" click "Fashion Bags
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/parent::div")).click();

		// Print the count of the items found
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[contains(@aria-label,'Items')]")).getText();
		System.out.println(text);

		// Get the list of brand of the products displayed in the page and print the
		// list.

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='brand']"));

		System.out.println("List of names of the bags");
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}

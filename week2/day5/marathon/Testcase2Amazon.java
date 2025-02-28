package week2.day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys");
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		
		//Print the total number of results
		String text = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base')]/span[1]")).getText();
		String text2 = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base')]/span[3]")).getText();
		System.out.println(text+" " +text2);
		
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//span[text()='Brands']//following::div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Brands']//following::div[2]")).click();
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//Print the first resulting bag info (name, discounted price)
		
		String text3 = driver.findElement(By.xpath("//h2[text()='Results']//following::h2[@class='a-size-mini s-line-clamp-1'][1]/span")).getText();
		System.out.println("Name of the Bag: " + text3);
		
		String text4 = driver.findElement(By.xpath("//span[@class='a-price'][1]")).getText();
		System.out.println("Price: " + text4);
		
		String title = driver.getTitle();
		System.out.println("Current page Title is: "+ title);
		driver.quit();

	}

}

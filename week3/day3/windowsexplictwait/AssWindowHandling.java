package week3.day3.windowsexplictwait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Merge Contacts")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From Contact']//following::a[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		String parentWindow = list.get(0);
		String childWindow = list.get(1);

		// Switch to child window
		driver.switchTo().window(childWindow);

		// Select first value from To contact list
		WebElement ch = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div[1]"));
		String text = ch.getText();
		System.out.println("From Contact - first resulting contact : " + text);
		ch.click();

		// Switch to parent window
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

		// Select second value from To contact list
		driver.findElement(By.xpath("//span[text()='To Contact']//following::a[1]")).click();

		Thread.sleep(1000);

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(windowHandles1);
		String parentWindow1 = list1.get(0);
		String childWindow1 = list1.get(1);

		// Switch to child window
		driver.switchTo().window(childWindow1);
		WebElement ch1 = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//div[1]"));
		String text1 = ch1.getText();
		System.out.println("To Contact - Second resulting contact : " + text1);
		ch1.click();

		// Switch to parent window
		driver.switchTo().window(parentWindow1);

		driver.findElement(By.linkText("Merge")).click();

		// Accept Alert
		driver.switchTo().alert().accept();

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
//(//table[@class='x-grid3-row-table']//a[contains(@id,'ext-gen')])
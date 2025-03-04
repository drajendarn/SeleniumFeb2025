package week3.day2.alertsframes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Test alert");
		Thread.sleep(1000);
		System.out.println("Text inside alert: " + alert.getText());
		alert.dismiss();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Confirmation message after dismiss: " + text);
		driver.quit();

	}

}

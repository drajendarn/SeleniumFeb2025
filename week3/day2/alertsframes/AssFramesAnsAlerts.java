package week3.day2.alertsframes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssFramesAnsAlerts {
	ChromeDriver driver = new ChromeDriver();

	public void launchbrowser() {

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void switchToFrames() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

	}

	public void switchToAlertsAccept() {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Text displayed within alerts - " + alert.getText());
		alert.sendKeys("Divya");
		alert.accept();
		WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
		String text = element.getText();
			
		if(text.contains("Hello Divya! How are you today?"))
		{
			System.out.println("Confirmation message displayed - " + text);
		}
		else
			System.out.println("Text not matched");
	}

	public void switchToAlertsDismiss() {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println("Confirmation message displayed after Dismissing alert - " + element.getText());
	}

	public void quitBrowser() {
		driver.quit();
	}

	public static void main(String[] args) {

		AssFramesAnsAlerts f = new AssFramesAnsAlerts();
		f.launchbrowser();
		f.switchToFrames();
		f.switchToAlertsAccept();
		f.switchToAlertsDismiss();
		f.quitBrowser();
	}

}

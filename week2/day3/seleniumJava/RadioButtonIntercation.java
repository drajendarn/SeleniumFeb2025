package week2.day3.seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonIntercation {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath(
				"//h5[text()='Your most favorite browser']/following::div[contains(@class,'ui-radiobutton-box')]"))
				.click();

		WebElement element = driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div//span"));
		element.click();

		// This WebElement is displayed in DOM only if the radio button is selected
		WebElement element2 = driver.findElement(By
				.xpath("//label[text()='Bengaluru']/preceding-sibling::div//span[contains(@class,'ui-icon-bullet')]"));

		// To check radio button is selected, by checking the WebElement
		System.out.println("Radio button is Selected or not: " + element2.isDisplayed());

		// to unSelect the radio button

		element.click();

		if (element2.isDisplayed() == true) {
			System.out.println("Radio button is unselected as expected ");
		} else
			System.out.println("Radio button is selected");

		// Identify the Safari radio button that is initially selected by default.
		WebElement element3 = driver.findElement(
				By.xpath("//label[text()='Safari']/preceding-sibling::div//span[contains(@class,'ui-icon-bullet')]"));
		if (element3.isDisplayed() == true) {
			System.out.println("Default Safari Radio button is selected ");
		} else
			System.out.println("Default Safari Radio button is not selected");

		// Check and select the age group (21-40 Years) if not already selected.
		WebElement element4 = driver.findElement(By.xpath(
				"//label[text()='21-40 Years']/preceding-sibling::div//span[contains(@class,'ui-icon-bullet')]"));
		if (element4.isDisplayed() == true) {
			System.out.println("Default 21-40 Years Radio button is already selected ");
		} else {
			element4.click();
			System.out.println("Default 21-40 Years Radio button is not selected earlier and it is selected now");
		}
		driver.quit();
	}

}

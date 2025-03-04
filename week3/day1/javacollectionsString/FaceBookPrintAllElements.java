package week3.day1.javacollectionsString;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPrintAllElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		//Using For Loop
		System.out.println("Using For Loop");
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		//Using For Each loop
		System.out.println("Using For Each Loop ");
		for(WebElement e:elements)
		{
			String text2 = e.getText();
			System.out.println(text2);
		}
		driver.quit();
	}

}

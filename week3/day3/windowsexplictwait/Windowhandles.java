package week3.day3.windowsexplictwait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		//To print Window values
		for (String string : windowHandles) {
			System.out.println(string);
		}

		List<String> list = new ArrayList<>(windowHandles);
		String parentWindow=list.get(0);
		String childWindow = list.get(1);
		
		//switch to parent childWindow
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

		driver.quit();
	}

}

package week3.day3.windowsexplictwait;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaits {
	
public static void main(String[] args)
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("//https://leafground.com/waits.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}

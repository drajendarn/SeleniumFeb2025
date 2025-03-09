package week3.day4.actionsclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssBigbasketActions {
	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click on "Shop by Category".
		WebElement sortByCat = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]/ancestor::button"));
		Actions action = new Actions(driver);
		action.moveToElement(sortByCat).click(sortByCat).perform();
		action.pause(1000).perform();

		// Mouse over "Foodgrains, Oil & Masala".
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement foodGrain = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(foodGrain).perform();
		action.pause(1000).perform();

		// Mouse over "Rice and Rice products".
		WebElement riceProd =
				// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[contains(text(),'Rice
				// Products')])[2]"))));
				wait.until(ExpectedConditions.visibilityOf(
						driver.findElement(By.xpath("(//a[text()='Organic Staples'])[1]//following::a"))));
		action.moveToElement(riceProd).perform();

		// Click on "Boiled & Steam Rice".
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		wait.until(ExpectedConditions.visibilityOf(boiledRice));
		action.moveToElement(boiledRice).click(boiledRice).perform();

		// Filter the results by selecting the brand "bb Royal".
		WebElement bbRoyal = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		wait.until(ExpectedConditions.visibilityOf(bbRoyal));
		action.moveToElement(bbRoyal).click(bbRoyal).perform();
		action.pause(1000).perform();

		// Click on "Tamil Ponni Boiled Rice".
		WebElement boildRice = driver
				.findElement(By.xpath("//h3[contains(text(),'Ponni Boiled Rice - 12 To 17 Months Old')]"));
		wait.until(ExpectedConditions.visibilityOf(boildRice));
		action.moveToElement(boildRice).click(boildRice).perform();
		action.pause(1000).perform();

		// Select the 5 Kg bag.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		String parentWindow = list.get(0);
		String childWindow = list.get(1);
		driver.switchTo().window(childWindow);

		WebElement packSize = driver.findElement(By.xpath("//span[text()='5 kg']"));
		wait.until(ExpectedConditions.visibilityOf(packSize));
		action.moveToElement(packSize).click(packSize).perform();
		// Check and note the price of the rice.
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Price:')]")).getText());

		// Click "Add" to add the bag to your cart.

		WebElement addCart = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(addCart));
		action.moveToElement(addCart).click(addCart).perform();
		// Verify the success message that confirms the item was added to your cart.

		WebElement successMsg = driver
				.findElement(By.xpath("//p[contains(text(),'An item has been added to your basket successfully')]"));

		if (successMsg.getText().contains("An item has been added to your basket successfully")) {
			System.out.println("Item added successfully and expected message displayed : " + successMsg.getText());
		}

		else
			System.out.println("Expected message not displated" + successMsg.getText());

		// Take a snapshot of the current page

		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\DIVYA\\Desktop\\Selenium Feb2025\\Selenium\\src\\main\\resources\\Snapshot\\Bigbasket.png");
		FileUtils.copyFile(src, des);

		// Close the current window.

		driver.close();
		
		// Close the main window.
		driver.switchTo().window(parentWindow);
		driver.close();

		System.out.println("All windows closed successfully");
	}
}

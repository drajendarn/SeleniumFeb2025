package week4.day1.webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssYahooWebtable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Load the url and click on “Crypto” tab
		Actions action = new Actions(driver);
		WebElement moreLink = driver.findElement(By.xpath("(//button[@aria-label='More'])[1]"));
		action.moveToElement(moreLink).perform();

		WebElement crypto = driver.findElement(By.xpath("//a[contains(@aria-label,'Finance: Crypto')]"));
		action.moveToElement(crypto).click(crypto).perform();

		// Identify the table in the dom using <table> tag (//table)

		driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']"));

		// To access the row values, identify the row using <tr> to travel through the
		// table
		List<WebElement> row = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr"));
		int rowSize = row.size()-1;//excluding table header
		System.out.println("Row Size:" + rowSize);
		// To access the column values of the table, identify the column using <th>/<td>
		//th used to get the column count based on column header
		
		List<WebElement> columnheader = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr/th"));
		int columnSize = columnheader.size();
		System.out.println("Column Size:" + columnSize);

		// Act on the elements in the table using WebElement function by iterating  through the rows and columns
		
		// and Print the cryptocurrency names from table.
		
		for (int i = 2; i <= rowSize; i++) //(tr[1] is header so actual row starts from 2)
		{
			
			WebElement cryptoName = driver.findElement(
					By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr[" + i + "]/td[2]"));

			System.out.println(cryptoName.getText());
		}
		
					
         driver.quit();
	}
}

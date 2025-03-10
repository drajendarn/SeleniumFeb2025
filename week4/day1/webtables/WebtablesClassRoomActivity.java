package week4.day1.webtables;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesClassRoomActivity {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		// Retrieve the train names from the web table.
		driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> row = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tbody/tr"));
		int rowSize = row.size();
		//th used to get the column count based on column header
		List<WebElement> columnheader = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/th"));
		int colSize = columnheader.size();
		System.out.println("No of rows:" + rowSize);
		System.out.println("No of cols: " + colSize);
		
		// Verify if there are any duplicate train names in the web table
		Set<String> removeDup = new HashSet<>();
		for (int i = 2; i <= rowSize; i++) {

			WebElement getTrainNames = driver.findElement(
					By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tbody/tr["
							+ i + "]/td[2]"));
			String trainNames = getTrainNames.getText();
			removeDup.add(trainNames);

		}
		//Print trains after removing duplicates
		for (String afterRemoveDup : removeDup) {
			System.out.println(afterRemoveDup);
		}
		
		
		
		//To print all values
		
				for (int x = 2; x <= rowSize; x++)
				{
					for (int y = 1; y <= 18; y++)// hardcoded 18 in order print the column values till 18th column
					{
						String headerText = columnheader.get(y-1).getText(); 
					WebElement cryptoName = driver.findElement(
							By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + x + "]/td["+y+"]"));

					System.out.print(headerText+ ":" +cryptoName.getText()+" | ");
				}
					System.out.println();
					
					
					
					
				}
				
				// to Print Specific column value ex) first row 4th column value
				WebElement fisrRowfourthCol = driver.findElement(
						By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[2]/td[4]"));
				System.out.println("fisrRowfourthCol"); 
				String headerText1 = columnheader.get(2).getText(); 
				System.out.println( headerText1+ ": "+ fisrRowfourthCol.getText());
				
				// to Print Specific Row value ex) third row entire column value (tr[1] is header so actual row starts from 2)
				
					WebElement thirdRow = driver.findElement(
							By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[4]"));
					System.out.println("thirdRow");
					System.out.println(thirdRow.getText());
				
					driver.quit();
	}		
				

	}



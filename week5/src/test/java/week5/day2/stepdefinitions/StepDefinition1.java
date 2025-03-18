package week5.day2.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	ChromeDriver driver ;
	
	@Given("open the chrome browser and Load the URL")
	public void open_the_chrome_browser_and_load_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	@When("User enters username as demosalesmanager")
	public void user_enters_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@When("User enters password as crmsa")
	public void user_enters_password_as_crmsa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		Assert.assertTrue(driver.getTitle().contains("Leaftaps - TestLeaf Automation Platform"), "Title not displayed as expected");
	}
	@Then("user should see welcome page")
	public void user_should_see_welcome_page() {
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
		Assert.assertTrue(element.getText().contains("Welcome"), "Welcome message not displayed.");
	}
	
	@Then("close the browser")
	public void close_browser() {
		driver.quit();
	}
	
	@When("User enters username as testuser")
	public void user_enters_username_as_testuser() {
		driver.findElement(By.id("username")).sendKeys("testuser");
	}
	@When("User enters password as testpass")
	public void user_enters_password_as_testpass() {
		driver.findElement(By.id("password")).sendKeys("testpass");
	}
	
	
	@When("user should see Error message")
	public void user_should_see_error_message() {
		String error = driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
		Assert.assertTrue(error.contains("User not found"), "Error message not displayed");
	}
	
	
}

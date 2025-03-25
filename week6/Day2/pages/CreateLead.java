package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethods {
	
	
	@When("Enter FirstName")
	public CreateLead enterFirstName()
	{
		getRd().findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
		return this;
	}
	@When("Enter LastName")
	public CreateLead enterLastName()
	{
		getRd().findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		return this;
	}
	@When("Enter CompanyName")
	public CreateLead enterCompanyName()
	{
		getRd().findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}
	@When("Select profileTitle")
	public CreateLead selectPageTitle()
	{
		getRd().findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		return this;
	}
	@When("Click Submit")
	public ViewLead clickSubmit()
	{
		getRd().findElement(By.className("smallSubmit")).click();
		return new ViewLead();
	}
	

}

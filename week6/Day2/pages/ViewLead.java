package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class ViewLead extends ProjectSpecificMethods {

	@When("verify Lead is created successfully")
	public ViewLead viewLead() {

		String title = getRd().getTitle();
		String expTitle = "View Lead | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title Not Matched");
	return this;
	}
}

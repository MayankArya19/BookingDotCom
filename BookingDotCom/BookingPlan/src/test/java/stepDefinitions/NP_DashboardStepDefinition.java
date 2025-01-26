package stepDefinitions;

import io.cucumber.java.en.Then;
import locators.NP_DashboardLocators;

public class NP_DashboardStepDefinition {
	
	NP_DashboardLocators db = new NP_DashboardLocators();
	
	@Then("^user can see dashboard$")
	public void validateLogin() {
		db.validateDB();
		
	}
	

}

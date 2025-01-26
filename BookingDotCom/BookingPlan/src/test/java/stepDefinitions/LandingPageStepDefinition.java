package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LandingPageLocators;

public class LandingPageStepDefinition {
LandingPageLocators landingPage = new LandingPageLocators();
	
	@Given("^user is on landing page$")
	public void landingPage () {
		landingPage.launchSession("https://www.booking.com/");
		
		
	}
	
	@Then("^user verifies stays$")
	public void staysService() {
		landingPage.verifyStays();
	}
	
	@And("^user clicks sign in$")
	public void signIn() {
		
		landingPage.clickSignIn();
		
		
	}
	@When("^user dismisses popup$")
	public void dismissPopup() {
		landingPage.closePopUp();

	}
	
	@Then("^user closes browser$")
	public void closeBrowser() {

		landingPage.closeBrowser();
		
	}
	@And("^user closes browsers$")
	public void closeBrowsers() {

		landingPage.closeBrowser();
		
	}

}

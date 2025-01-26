package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.NC_LoginPageLocator;

public class NopCommerceLoginPageStepDefinition {
	
	NC_LoginPageLocator lp = new NC_LoginPageLocator();
	
	@Given("^user is on landings page$")
	public void launchNopCommerceSession() {
		lp.launchSession("https://admin-demo.nopcommerce.com/");
		
	}
	
	@When("^user clicks on login$")
	public void clickLogin() {
		
		lp.clickLoginButton();
		
	}
	
	@And("^user enter username$")
	public void enterUser() {
		lp.enterEmail("");
		
	}
	@And("^user enters password$")
	public void enterPassword() {
		lp.enterPassword("");
	}
	
	

}

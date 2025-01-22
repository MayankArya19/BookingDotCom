package stepDefinitions;

import io.cucumber.java.en.And;
import locators.SignInPageLocators;

public class SignInPageStepDefinition {
	SignInPageLocators signIn = new SignInPageLocators();
	@And("^user enters username$")
	public void enterUsername() {
		
		signIn.enterUsername();
		
	}
	
	

}

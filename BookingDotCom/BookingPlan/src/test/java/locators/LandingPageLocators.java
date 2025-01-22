package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Util.DriverUtil;

public class LandingPageLocators extends DriverUtil {
	
	private By popUp = By.xpath("//button[starts-with(@aria-label,'Dismiss')]");
	
	private By signIn = By.linkText("Sign in");
	
	public void closePopUp() {

		WebElement element = waitUntilElementToBeClickable(popUp);
		element.click();
		pause();
	}
	
	public void clickSignIn() {
		WebElement element = waitUntilElementToBeClickable(signIn);

		element.click();
		pause();
		
	}
	
	

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Util.DriverUtil;

public class SignInPageLocators extends DriverUtil{
	
	private By userName = By.name("username");
	
	public void enterUsername() {
		
		WebElement element=waitUntilElementToBeVisible(userName);
		element.sendKeys("aryamayank19@gmail.com");
		
		
	}
	

}

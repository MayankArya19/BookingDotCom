package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Util.DriverUtil;

public class NC_LoginPageLocator extends DriverUtil{
	
	private By email = By.id("Email");
	private By password = By.id("Password");
	private By login = By.xpath("//button[@type='submit']");
	
	public void enterEmail(String username) {
		WebElement element = waitUntilElementToBeVisible(email);
		element.sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		WebElement element = waitUntilElementToBeVisible(password);
		element.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		WebElement element =  waitUntilElementToBeClickable(login);
		element.click();
	}
	

}

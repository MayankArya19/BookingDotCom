package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Util.DriverUtil;

public class NP_DashboardLocators extends DriverUtil{
	
	private By dashboard = By.xpath("//div[@class='content-header']/h1");
	
	public void validateDB() {
		WebElement element = waitUntilElementToBeVisible(dashboard);
		String text = element.getText();
		Assert.assertEquals("Dashboard", text);
	}
	
	

}

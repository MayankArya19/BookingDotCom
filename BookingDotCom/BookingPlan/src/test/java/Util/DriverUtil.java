package Util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;
import Driver.DriverFactory;

public class DriverUtil {
	
	private WebDriver driver;
	
	private static JavascriptExecutor jse;
	
	private static WebDriverWait wait;
	
	public void launchSession(String url) {
		//Driver.getInstance().setDriver(driver);
		WebDriver driverParam = DriverFactory.getDriverManager("chrome").getDriver();
		Driver.getInstance().setDriver(driverParam);
		driver = Driver.getInstance().getDriver();
		jse=(JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
	}
	public WebElement waitUntilElementToBeClickable(By locator) {
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
		executionOrder(ele);
		
		return ele;
		
	}
public WebElement waitUntilElementToBeVisible(By locator) {
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		executionOrder(ele);
		
		return ele;
		
	}
	public void highlightElement (WebElement element) {
		jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	
	public void scrollToElement (WebElement element) {
		jse.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element);

	}
	
	public void pause() {
		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void removeHighlightElement (WebElement element) {
		jse.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid white;');", element);
	}
	public void closeBrowser() {
		Driver.getInstance().closeDriver();
	}
	
	public void executionOrder(WebElement element) {
		scrollToElement(element);
		highlightElement(element);
		pause();
		removeHighlightElement(element);
	}

}

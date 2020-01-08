package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperations {
	
	private static WebDriverWait wait;
	private static Actions actions;
	
	public static boolean waitForElementToBePresent(WebDriver driver, WebElement element){
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	public static boolean waitForElementToBeActive(WebDriver driver, WebElement element){
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element.isEnabled();
	}
}

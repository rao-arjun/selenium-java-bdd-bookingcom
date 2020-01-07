package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumOperations;

public class CarRentalsPage {
	private WebDriver driver;
	
	By carRentalsSearchSection = By.xpath("//span[@class='sb-searchbox__title-text']");
	
	public CarRentalsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isCarRentalsPageDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(carRentalsSearchSection));
	}
	
	public String returnPageHeaderTitle(){
		return driver.findElement(carRentalsSearchSection).getText();
	}
	
}

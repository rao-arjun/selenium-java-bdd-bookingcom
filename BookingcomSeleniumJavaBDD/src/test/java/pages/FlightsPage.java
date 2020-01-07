package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumOperations;

public class FlightsPage {
	private WebDriver driver;
	
	By flightsSearchSection = By.xpath("//div[@class='displayCatBlock']");
	
	public FlightsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isFlightsPageDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(flightsSearchSection));
	}
}

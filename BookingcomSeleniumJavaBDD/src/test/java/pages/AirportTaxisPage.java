package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumOperations;

public class AirportTaxisPage {
	private WebDriver driver;
	
	By airportTaxisSearchSection = By.xpath("//span[@class='sb-searchbox__title-text']");
	
	public AirportTaxisPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isAirportTaxisPageDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(airportTaxisSearchSection));
	}
	
	public String returnPageHeaderTitle(){
		return driver.findElement(airportTaxisSearchSection).getText();
	}
}

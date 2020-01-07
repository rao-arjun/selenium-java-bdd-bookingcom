package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumOperations;

public class HomePage {
	
	private WebDriver driver;
	
	private By flightsLink = By.cssSelector("a[class='xpb__link'][data-decider-header='flights']");
	private By carRentalsLink = By.cssSelector("a[class='xpb__link'][data-ga-track='click|Product Expansion|cars|rentalcars (index)']");
	private By airportTaxis = By.cssSelector("a[class='xpb__link'][data-decider-header='rideways']");
	private By pageTitleLogo = By.id("logo_no_globe_new_logo");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isWebPageTitleBookingCom(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(pageTitleLogo));
	}
	
	public void clickFlightsLink(){
		driver.findElement(flightsLink).click();
	}
	
	public void clickCarRentalLink(){
		driver.findElement(carRentalsLink).click();
	}
	
	public void clickAirportTaxisLink(){
		driver.findElement(airportTaxis).click();
	}
	
}

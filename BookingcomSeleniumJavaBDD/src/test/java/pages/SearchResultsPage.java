package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumOperations;

public class SearchResultsPage {
	private WebDriver driver;
	private By searchResultsSection = By.xpath("//div[contains(@id,'results-section')]");
	private By bestFlightSection = By.xpath("//div[@class='best-flights-list-results']//*[contains(@class,'Flights-Results-ResultInfo')]//ol");
	
	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isSearchResultDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(searchResultsSection));
	}
	
	public int countOfFlightPlansInItineraryOfBestFlight(){
		return driver.findElement(bestFlightSection).findElements(By.tagName("li")).size();
	}
}

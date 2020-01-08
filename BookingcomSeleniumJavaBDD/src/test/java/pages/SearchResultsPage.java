package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumOperations;

public class SearchResultsPage {
	private WebDriver driver;
	private By searchResultsSection = By.xpath("//*[@id='QnDk-results-section']");
	private By bestFlightSection = By.xpath("//div[@class='best-flights-list']//*[@id='Bt2T-info']/ol)");
	
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

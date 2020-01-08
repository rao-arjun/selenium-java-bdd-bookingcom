package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumOperations;

public class FlightsPage {
	private WebDriver driver;
	
	private By flightsSearchSection = By.xpath("//div[@class='displayCatBlock']");
	
	private By returnLabel = By.xpath("//span[contains(text(),'Return')]");	
	private By oneWayLabel = By.xpath("//span[contains(text(),'One-way')]");
	
	private By originTextBox = By.xpath("//input[@id='SXdk-origin']");
	private By destinationTextBox = By.xpath("//input[@id='SXdk-destination']");
	private By searchButton = By.xpath("//*[@id='Xdk-submit']");
	
	private By travellersDropDown = By.xpath("//input[@id='SXdk-travelers']");
	private By travellersAdultSelectorDecrement = By.xpath("//*[@id='SXdk-adults']/div/child::div[1]/button");
	private By travellersAdultSelectorNumber = By.xpath("//*[@id='SXdk-adults']/div/child::div[2]/input");
	private By travellersAdultSelectorIncrement = By.xpath("//*[@id='SXdk-adults']/div/child::div[3]/button");
			
	public FlightsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isFlightsPageDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(flightsSearchSection));
	}
	
	public void searchFlightsOneWay(String from, String to, int no){
		driver.findElement(oneWayLabel).click();
		enterSourceAndDestination(from, to);
		selectNoOfAdults(no);
		driver.findElement(searchButton).click();
	}
	
	public void searchFlightsReturn(String from, String to, int no){
		driver.findElement(returnLabel).click();
		enterSourceAndDestination(from, to);
		selectNoOfAdults(no);
		driver.findElement(searchButton).click();
	}
	
	private void enterSourceAndDestination(String from, String to){
		driver.findElement(originTextBox).clear();
		driver.findElement(originTextBox).sendKeys(from);
		
		driver.findElement(destinationTextBox).clear();
		driver.findElement(destinationTextBox).sendKeys(to);
	}
	
	private void selectNoOfAdults(int num){
		driver.findElement(travellersDropDown).click();
		int selectedNoOfAdults = Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"));
		if(selectedNoOfAdults>num){
			while(num!=Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"))){
				driver.findElement(travellersAdultSelectorDecrement).click();
			}
		}else if(selectedNoOfAdults<num){
			while(num!=Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"))){
				driver.findElement(travellersAdultSelectorIncrement).click();
			}
		}else{
			return;
		}
	}
}

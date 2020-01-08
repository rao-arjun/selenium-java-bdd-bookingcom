package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumOperations;
import utils.HelperFunctions;

public class FlightsPage {
	private WebDriver driver;
	
	private By flightsSearchSection = By.xpath("//div[@class='displayCatBlock']");
	
	private By returnLabel = By.xpath("//label[contains(@id,'roundtrip')]");
	private By oneWayLabel = By.xpath("//label[contains(@id,'oneway')]");
	
	private By originTextBox = By.xpath("//input[contains(@id,'origin')]");
	private By destinationTextBox = By.xpath("//input[contains(@id,'destination')]");
	private By searchButton = By.xpath("//button[@type='submit']");
	
	private By departDateTextBox = By.xpath("//div[contains(@id,'depart-input')]");
	private By returntDateTextBox = By.xpath("//div[contains(@id,'depart-input')]");

	private By datePickerMonths = By.xpath("//div[contains(@id,'months')]//div[2]");
	private By scrollNextMonthButton = By.cssSelector("div[id*='next'][role='button']");
	private By dateMonthDisplay = By.xpath("//div[contains(@id,'months')]//child::div[2]//*[@class='monthDisplay']");
	private By dateDaysDisplay = By.xpath("//div[contains(@id,'months')]//child::div[2]//*[@class='weeks']//div[contains(@class,'weekGrid')]");
	private By dayOfMonth = By.xpath("//*[contains(@class,'col-day')]");

	private By travellersDropDown = By.xpath("//a[contains(@id,'travelers')]");
	private By travellersSection = By.xpath("//div[contains(@id,'travelers_content')]");
	private By travellersAdultSelectorDecrement = By.xpath("//div[contains(@id,'adults')]//div//child::div[1]//button");
	private By travellersAdultSelectorNumber = By.xpath("//div[contains(@id,'adults')]//div//child::div[2]//input");
	private By travellersAdultSelectorIncrement = By.xpath("//div[contains(@id,'adults')]//div//child::div[3]//button");

	public FlightsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isFlightsPageDisplayed(){
		return SeleniumOperations.waitForElementToBePresent(driver, driver.findElement(flightsSearchSection));
	}
	
	public void searchFlightsOneWay(String from, String to, int no){
		driver.findElement(oneWayLabel).click();
		enterSourceAndDestination(from, to);
		enterDepartureDate();
		//selectNoOfAdults(no);
		driver.findElement(searchButton).click();
	}
	
	public void searchFlightsReturn(String from, String to, int no){
		driver.findElement(returnLabel).click();
		enterSourceAndDestination(from, to);
		enterDepartureAndReturnDate();
		//selectNoOfAdults(no);
		driver.findElement(searchButton).click();
	}
	
	private void enterSourceAndDestination(String from, String to){
		driver.findElement(originTextBox).clear();	
		driver.findElement(originTextBox).click();
		driver.findElement(originTextBox).sendKeys(from);
		
		driver.findElement(destinationTextBox).click();
		driver.findElement(destinationTextBox).clear();
		driver.findElement(destinationTextBox).sendKeys(to);
	}
	
	private void enterDepartureAndReturnDate(){
		driver.findElement(departDateTextBox).click();
		selectDate(HelperFunctions.returnDateRelativeToCurrentDate(1));
		
		driver.findElement(returntDateTextBox).click();
		selectDate(HelperFunctions.returnDateRelativeToCurrentDate(15));
	}
	
	private void enterDepartureDate(){
		driver.findElement(departDateTextBox).click();
		selectDate(HelperFunctions.returnDateRelativeToCurrentDate(1));
	}
	

	private void selectDate(String date){
		String[] arrDate = date.split("/");
		String day = arrDate[0];
		String month = arrDate[1];
		String year = arrDate[2];
		scrollToYearAndMonth(year,month);
		clickOnDayOfTheMonth(day);
	}
	
	private void clickOnDayOfTheMonth(String day) {
		Boolean bClicked = false;
		List<WebElement> weekViews = driver.findElements(dateDaysDisplay);
		System.out.println(weekViews.size());
		int iDay = Integer.parseInt(day);
		
		if(iDay<10){
			iDay = iDay%10;
		}
		for(WebElement weekView: weekViews){
			List<WebElement> weekRows = weekView.findElements(By.className("day"));
			for(WebElement weekRow: weekRows){
				if(weekRow.getText().length()>0&&iDay==Integer.parseInt(weekRow.getText())){
					weekRow.click();
					bClicked = true;
					break;
				}
			}
			if(bClicked){
				break;
			}
		}
	}

	private void scrollToYearAndMonth(String year, String month){
		while(!driver.findElement(dateMonthDisplay).getText().contains(year)){
			driver.findElement(scrollNextMonthButton).click();
		}
		switch(month){
			case "01": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("January")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "02": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("February")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "03": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("March")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "04": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("April")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "05": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("May")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "06": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("June")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "07": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("July")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "08": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("August")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "09": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("September")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "10": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("October")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "11": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("November")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
			case "12": 
				while(!driver.findElement(dateMonthDisplay).getText().contains("December")){
					driver.findElement(scrollNextMonthButton).click();
				}
				break;
		}
	}
	
	
	private void selectNoOfAdults(int num){
		driver.findElement(travellersDropDown).click();
		if(SeleniumOperations.waitForElementToBeActive(driver, driver.findElement(travellersSection))){
			driver.findElement(travellersSection).click();
			int selectedNoOfAdults = Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"));
			if(selectedNoOfAdults>num){
				while(num!=Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"))){
					driver.findElement(travellersAdultSelectorDecrement).click();
				}
			}else if(selectedNoOfAdults<num){
				while(num!=Integer.parseInt(driver.findElement(travellersAdultSelectorNumber).getAttribute("value"))){
					System.out.println(driver.findElement(travellersAdultSelectorIncrement).getAttribute("title"));
					driver.findElement(travellersAdultSelectorIncrement).click();
				}
			}else{
				return;
			}
		}

	}
}

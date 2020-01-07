package stepdefinitions;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.AirportTaxisPage;
import pages.CarRentalsPage;
import pages.FlightsPage;
import pages.HomePage;

public class BookingcomNavigationStepDefs extends AppSetup{
	
	@Before
	public void start() throws FileNotFoundException{
		setup();
		logger.info("------Starting Web Driver session - Booking.com UI-----");
		initializeHomePage();
		initializeAirportTaxisPage();
		initializeCarRentalsPage();
		initializeFlightsPage();
	}
	
	@After
	public void stop(){
		logger.info("-----Shutting down application Booking.com/ driver-----");
		tearDown();
	}
	
    @Given("Home Page of Booking.com is displayed")
	public void homepage_of_bookingcom_is_displayed(){
		System.out.println("Verifying Home page displayed");
		logger.debug("-----Verifying Home page displayed-----");
		Assert.assertTrue("Booking.com Home Page displayed?", homePage.isWebPageTitleBookingCom());
	}
	
    @When("Flights link is clicked")
	public void flights_link_is_clicked(){
    	System.out.println("Clicking on Flights link");
    	logger.info("-----Clicking on Flights link-----");
    	homePage.clickFlightsLink();
	}
    
    @When("Car Rentals link is clicked")
    public void car_rentals_link_is_clicked(){
    	System.out.println("Clicking on Car Rentals link");
    	logger.info("-----Clicking on Car Rentals link-----");
    	homePage.clickCarRentalLink();
    }
    
    @When("Airport Taxis link is clicked")
    public void airport_taxis_link_is_clicked(){
    	System.out.println("Clicking on Airport Taxis link");
    	logger.info("-----Clicking on Airport Taxis link-----");
    	homePage.clickAirportTaxisLink();
    }
    
    @Then("Airport Taxis Page is displayed")
    public void airport_taxis_page_is_displayed(){
    	logger.debug("-----Verifying navigation to Airport Taxis Page-----");
    	if(airportTaxisPage.isAirportTaxisPageDisplayed()){
    		Assert.assertTrue(airportTaxisPage.returnPageHeaderTitle().contains("airport taxi"));
    		logger.info("-----Airport Taxis Page title is displayed-----");
    	}else{
    		logger.error("-----Airport Taxis Page title is not displayed-----");
    	}
    }
    
    @Then("Car Rentals Page is displayed")
    public void car_rentals_page_is_displayed(){
    	logger.debug("-----Verifying navigation to Airport Taxis Page-----");
    	if(carRentalsPage.isCarRentalsPageDisplayed()){
    		System.out.println("The title is" + carRentalsPage.returnPageHeaderTitle());
    		Assert.assertTrue(carRentalsPage.returnPageHeaderTitle().contains("Car rentals"));
    		logger.info("-----Car Rentals Page title is displayed-----");
    	}else{
    		logger.error("-----Car Rentals Page title is not displayed-----");
    	}
    }
    
    @Then("Flights Page is displayed")
	public void flights_page_is_displayed(){
    	logger.debug("-----Verifying navigation to Flights Page-----");
    	Assert.assertTrue(flightsPage.isFlightsPageDisplayed());
    	logger.info("-----Flights Page title is displayed-----");
	}

}

package stepdefinitions;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.AirportTaxisPage;
import pages.CarRentalsPage;
import pages.FlightsPage;
import pages.HomePage;

public class BookingcomStepDefs extends AppSetup{
	
	@Before
	public void start() throws FileNotFoundException{
		setup();
		logger.info("------Starting Web Driver session - Booking.com UI-----");
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
		initializeHomePage();
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
    	initializeAirportTaxisPage();
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
    	initializeCarRentalsPage();
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
    	initializeFlightsPage();
    	Assert.assertTrue(flightsPage.isFlightsPageDisplayed());
    	logger.info("-----Flights Page title is displayed-----");
	}
    
	@When("One Way Search is performed with {string} and {string} in the Flights page for {int} adults")
	public void search_flights_oneWay(String origin, String destination, int nooftravellers){
		System.out.println("Searching flights");
		logger.info("-----Searching flights-----");
		flightsPage.searchFlightsOneWay(origin, destination, nooftravellers);
	}
	
	@When("Return Search is performed with {string} and {string} in the Flights page for {int} adults")
	public void search_flights_return(String origin, String destination, int nooftravellers){
		flightsPage.searchFlightsReturn(origin, destination, nooftravellers);
		System.out.println("Searching flights");
		logger.info("-----Searching flights-----");
	}
	
	@Then("Search Results page should be displayed")
	public void search_results_page_verify(){
		initializeSearchResultsPage();
		System.out.println("In Search Results page ");
		logger.info("-----In Search Results page-----");
		Assert.assertTrue(searchResultsPage.isSearchResultDisplayed());
	}
	
	@And("Each itinerary should contain single way flight details")
	public void check_single_way_flight(){
		System.out.println("Verifying only one way flight is shown");
		logger.debug("-----Verifying only one way flight is shown-----");
		Assert.assertEquals(1, searchResultsPage.countOfFlightPlansInItineraryOfBestFlight());
	}
	
	@And("Each itinerary should contain two way flight details")
	public void check_two_way_flight(){
		System.out.println("Verifying only two way flight is shown");
		logger.debug("-----Verifying only two way flight is shown-----");
		Assert.assertEquals(2, searchResultsPage.countOfFlightPlansInItineraryOfBestFlight());

	}

}

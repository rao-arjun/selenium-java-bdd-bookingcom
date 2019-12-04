package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.AirportTaxisPage;
import pages.CarRentalsPage;
import pages.FlightsPage;
import pages.HomePage;

public class HomePageStepDefs extends AppDriverSetup{
	
	private AppDriverSetup appSetup;
	private HomePage homePage;
	private FlightsPage flightsPage;
	private CarRentalsPage carRentalsPage;
	private AirportTaxisPage airportTaxisPage;
	
	@Before
	public void start(){
		appSetup = new AppDriverSetup();
		appSetup.driverSetup();
	}
	
	@After
	public void stop(){
		appSetup.tearDown();
	}
	
    @Given("Home Page of Booking.com is displayed")
	public void homepage_of_bookingcom_is_displayed(){
		System.out.println("Verifying Home page displayed");
		homePage = new HomePage(driver);

	}
	
    @When("Flights link is clicked")
	public void flights_link_is_clicked(){
    	System.out.println("Clicking on Flights link");
	}
    
    @When("Car Rentals link is clicked")
    public void car_rentals_link_is_clicked(){
    	System.out.println("Clicking on Car Rentals link");
    }
    
    @When("Airport Taxis link is clicked")
    public void airport_taxis_link_is_clicked(){
    	System.out.println("Clicking on Airport Taxis link");
    }
    
    @Then("Airport Taxis Page is displayed")
    public void airport_taxis_page_is_displayed(){
    	System.out.println("Verifying Airport Taxis page is displayed");
    }
    
    @Then("Car Rentals Page is displayed")
    public void car_rentals_page_is_displayed(){
    	System.out.println("Verifying Car Rentals page is displayed");
    }
    
    @Then("Flights Page is displayed")
	public void flights_page_is_displayed(){
    	System.out.println("Verifying Flights page displayed");
	}
    //Flights Page is displayed
}

Feature: Home Page Navigation scenarios
	
	@regression
  Scenario: Navigation to Flights page
    Given Home Page of Booking.com is displayed
    When Flights link is clicked
    Then Flights Page is displayed
	
	@regression
  Scenario: Navigation to Car Rentals page
    Given Home Page of Booking.com is displayed
    When Car Rentals link is clicked
    Then Car Rentals Page is displayed
	
	@regression
  Scenario: Navigation to Airport Taxis page
    Given Home Page of Booking.com is displayed
    When Airport Taxis link is clicked
    Then Airport Taxis Page is displayed
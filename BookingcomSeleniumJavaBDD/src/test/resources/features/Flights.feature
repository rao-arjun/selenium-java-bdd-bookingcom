Feature: Search Flights

Background: The user should be in the Flights section in the application
    Given Home Page of Booking.com is displayed
    When Flights link is clicked
    Then Flights Page is displayed

  @smoke
  Scenario Outline: One Way Trip 
    When One Way Search is performed with "<origin>" and "<destination>" in the Flights page for <nooftravellers> adults
    Then Search Results page should be displayed
    And Each itinerary should contain single way flight details

    Examples: 
      | origin   | destination | nooftravellers|
      | Bengaluru| Mumbai			 | 2             |
      | Chennai  | Kolkata		 | 3             |
      
  @regression
  Scenario Outline: Return Trip
    When Return Search is performed with "<origin>" and "<destination>" in the Flights page for <nooftravellers> adults
    Then Search Results page should be displayed
    And Each itinerary should contain two way flight details

    Examples: 
      | origin   | destination | nooftravellers|
      | Bengaluru| Mumbai			 | 2             |
      | Chennai  | Kolkata		 | 1             |

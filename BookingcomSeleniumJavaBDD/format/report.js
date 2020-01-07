$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePage.feature");
formatter.feature({
  "name": "Home Page Navigation scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigation to Flights page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Home Page of Booking.com is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.homepage_of_bookingcom_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights link is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.flights_link_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.flights_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigation to Car Rentals page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Home Page of Booking.com is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.homepage_of_bookingcom_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Car Rentals link is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.car_rentals_link_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Car Rentals Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.car_rentals_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigation to Airport Taxis page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Home Page of Booking.com is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.homepage_of_bookingcom_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Airport Taxis link is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.airport_taxis_link_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Airport Taxis Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.airport_taxis_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
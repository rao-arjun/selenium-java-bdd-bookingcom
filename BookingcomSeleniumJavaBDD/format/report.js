$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Flights.feature");
formatter.feature({
  "name": "Search Flights",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Return Trip",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Search is performed with \"\u003corigin\u003e\" and \"\u003cdestination\u003e\" in the Flights page for \u003cnooftravellers\u003e adults",
  "keyword": "When "
});
formatter.step({
  "name": "Search Results page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Each itinerary should contain two way flight details",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "origin",
        "destination",
        "nooftravellers"
      ]
    },
    {
      "cells": [
        "Bengaluru",
        "Mumbai",
        "2"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Kolkata",
        "3"
      ]
    }
  ]
});
formatter.background({
  "name": "The user should be in the Flights section in the application",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Return Trip",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Search is performed with \"Bengaluru\" and \"Mumbai\" in the Flights page for 2 adults",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.search_flights(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Results page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.search_results_page_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Each itinerary should contain two way flight details",
  "keyword": "And "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.check_two_way_flight()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "The user should be in the Flights section in the application",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Return Trip",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Search is performed with \"Chennai\" and \"Kolkata\" in the Flights page for 3 adults",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.search_flights(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Results page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.search_results_page_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Each itinerary should contain two way flight details",
  "keyword": "And "
});
formatter.match({
  "location": "BookingcomNavigationStepDefs.check_two_way_flight()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
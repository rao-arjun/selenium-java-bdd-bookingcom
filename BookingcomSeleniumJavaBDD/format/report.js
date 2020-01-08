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
  "name": "Return Search is performed with \"\u003corigin\u003e\" and \"\u003cdestination\u003e\" in the Flights page for \u003cnooftravellers\u003e adults",
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
        "Bengaluru (BLR)",
        "Mumbai (BOM)",
        "2"
      ]
    },
    {
      "cells": [
        "Chennai (MAS)",
        "Kolkata (CCU)",
        "1"
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
  "location": "BookingcomStepDefs.homepage_of_bookingcom_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights link is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomStepDefs.flights_link_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomStepDefs.flights_page_is_displayed()"
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
  "name": "Return Search is performed with \"Bengaluru (BLR)\" and \"Mumbai (BOM)\" in the Flights page for 2 adults",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomStepDefs.search_flights_return(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Results page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomStepDefs.search_results_page_verify()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[FirefoxDriver: firefox on WINDOWS (a3fafbcd-085d-452c-a17d-8e04c315fc77)] -\u003e xpath: //div[contains(@id,\u0027results-section\u0027)]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SMAT8QD\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 71.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191202093317, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 21920, moz:profile: C:\\Users\\arjunrao\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a3fafbcd-085d-452c-a17d-8e04c315fc77\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utils.SeleniumOperations.waitForElementToBePresent(SeleniumOperations.java:16)\r\n\tat pages.SearchResultsPage.isSearchResultDisplayed(SearchResultsPage.java:19)\r\n\tat stepdefinitions.BookingcomStepDefs.search_results_page_verify(BookingcomStepDefs.java:116)\r\n\tat ✽.Search Results page should be displayed(file:src/test/resources/features/Flights.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Each itinerary should contain two way flight details",
  "keyword": "And "
});
formatter.match({
  "location": "BookingcomStepDefs.check_two_way_flight()"
});
formatter.result({
  "status": "skipped"
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
  "location": "BookingcomStepDefs.homepage_of_bookingcom_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights link is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomStepDefs.flights_link_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flights Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomStepDefs.flights_page_is_displayed()"
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
  "name": "Return Search is performed with \"Chennai (MAS)\" and \"Kolkata (CCU)\" in the Flights page for 1 adults",
  "keyword": "When "
});
formatter.match({
  "location": "BookingcomStepDefs.search_flights_return(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Results page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingcomStepDefs.search_results_page_verify()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[FirefoxDriver: firefox on WINDOWS (e9e9a10c-06f6-4707-8c2b-604cf4bd0be4)] -\u003e xpath: //div[contains(@id,\u0027results-section\u0027)]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SMAT8QD\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 71.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191202093317, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 21484, moz:profile: C:\\Users\\arjunrao\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e9e9a10c-06f6-4707-8c2b-604cf4bd0be4\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utils.SeleniumOperations.waitForElementToBePresent(SeleniumOperations.java:16)\r\n\tat pages.SearchResultsPage.isSearchResultDisplayed(SearchResultsPage.java:19)\r\n\tat stepdefinitions.BookingcomStepDefs.search_results_page_verify(BookingcomStepDefs.java:116)\r\n\tat ✽.Search Results page should be displayed(file:src/test/resources/features/Flights.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Each itinerary should contain two way flight details",
  "keyword": "And "
});
formatter.match({
  "location": "BookingcomStepDefs.check_two_way_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
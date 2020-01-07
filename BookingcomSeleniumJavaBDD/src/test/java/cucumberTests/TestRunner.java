package cucumberTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:format"},
				features={"src/test/resources/features/Flights.feature"},
				glue={"stepdefinitions"}, 
				tags={"@regression"})
public class TestRunner {

}

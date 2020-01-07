package stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.AirportTaxisPage;
import pages.CarRentalsPage;
import pages.FlightsPage;
import pages.HomePage;

public class AppSetup {
	
	protected WebDriver driver;
	protected Logger logger;
	private Properties configProperties;
	
	public HomePage homePage;
	public FlightsPage flightsPage;
	public CarRentalsPage carRentalsPage;
	public AirportTaxisPage airportTaxisPage;
	
	
	public void setup() throws FileNotFoundException{
		configProperties = new Properties();
		FileInputStream configPropFile = new FileInputStream("config.properties");
		try {
			configProperties.load(configPropFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browser = configProperties.getProperty("browser");
		String URL = configProperties.getProperty("applicationURL");
		logger = Logger.getLogger("Booking");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("------Starting Web Driver session - Booking.com UI-----");
		
		switch(browser.toUpperCase()){
			case "IE":
				InternetExplorerOptions  ieoptions = new InternetExplorerOptions();
				ieoptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
				ieoptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_ALERTS, true);	
				
				System.setProperty("webdriver.ie.driver", configProperties.getProperty("iepath"));			
				this.driver = new InternetExplorerDriver();
				break;
			case "FIREFOX":
			    FirefoxProfile fxProfile = new FirefoxProfile();
			    fxProfile.setPreference("browser.download.folderList", 2);
			    fxProfile.setPreference("browser.download.manager.showWhenStarting", false);
			    fxProfile.setPreference("browser.download.dir",System.getProperty("user.dir"));
			    
				FirefoxOptions foptions = new FirefoxOptions().setProfile(fxProfile);
				foptions.setAcceptInsecureCerts(true);
				foptions.addArguments("--test-type","start-maximized","disable-popup-blocking");
				foptions.addPreference("browser.startup.homepage", "about:blank");
				foptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				foptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
				foptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
				foptions.setCapability(CapabilityType.SUPPORTS_ALERTS, true);				
				
				System.setProperty("webdriver.gecko.driver", configProperties.getProperty("firefoxpath"));			
				this.driver = new FirefoxDriver(foptions);
				break;
			case "CHROME":
				ChromeOptions coptions = new ChromeOptions();
				coptions.setAcceptInsecureCerts(true);
				coptions.addArguments("--test-type","start-maximized","disable-popup-blocking");
				Map<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
				coptions.setExperimentalOption("prefs", chromePrefs);
				coptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				coptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
				coptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
				coptions.setCapability(CapabilityType.SUPPORTS_ALERTS, true);	
				
				System.setProperty("webdriver.chrome.driver", configProperties.getProperty("chromepath"));
				this.driver = new ChromeDriver(coptions);
				break;
			default:
				System.out.println("Invalid Browser");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	protected void initializeHomePage(){
		homePage = new HomePage(driver);
	}
	
	protected void initializeFlightsPage(){
		flightsPage = new FlightsPage(driver);
	}
	
	protected void initializeCarRentalsPage(){
		carRentalsPage = new CarRentalsPage(driver);
	}
	
	protected void initializeAirportTaxisPage(){
		airportTaxisPage = new AirportTaxisPage(driver);
	}
	
	public void tearDown(){
		this.driver.quit();
	}
	
}

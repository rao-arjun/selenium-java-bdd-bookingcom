package stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

public class AppDriverSetup {
	
	protected WebDriver driver;
	private static final String URL = "https://booking.com";
	private String driverPath = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\";
	private final String browser = "FireFox";
	
	public void driverSetup(){
		switch(browser.toUpperCase()){
			case "IE":
				InternetExplorerOptions  ieoptions = new InternetExplorerOptions();
				ieoptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
				ieoptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
				ieoptions.setCapability(CapabilityType.SUPPORTS_ALERTS, true);	
				
				System.setProperty("webdriver.chrome.driver", driverPath+"iedriver.exe");			
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
				
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");			
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
				
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
				this.driver = new ChromeDriver(coptions);
				break;
			default:
				System.out.println("Invalid Browser");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	public void tearDown(){
		this.driver.quit();
	}
	
}

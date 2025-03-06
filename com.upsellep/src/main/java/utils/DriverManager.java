package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	static ConfigData config;
	static protected WebDriver driver;
	
	public static WebDriver getDriver(WebDriver driver) {
		if(driver == null) {
			config = new ConfigData();
			String browserName = config.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void quitDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	
}

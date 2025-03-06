package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.ConfigData;
import utils.DriverManager;

public class RunTest {
	
	private WebDriver driver;
	private ConfigData config;
	private LoginPage loginpage;
	
	
	@BeforeClass
	public void setUp() {
		config = new ConfigData();
		driver = DriverManager.getDriver(driver);
		driver.get(config.getProperty("url"));
		loginpage = new LoginPage(driver);
	}
	
	@Test (priority=1)
	public void login() {
		loginpage.enterUserName("username");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();
	}
	
	
}

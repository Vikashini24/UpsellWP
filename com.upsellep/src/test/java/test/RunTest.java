package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UpsellPage;
import utils.ConfigData;
import utils.DriverManager;

public class RunTest {
	
	private WebDriver driver;
	private ConfigData config;
	private LoginPage loginpage;
	private UpsellPage upsellpage;
	
	@BeforeTest
	public void setUp() {
		config = new ConfigData();
		driver = DriverManager.getDriver(driver);
		driver.get(config.getProperty("url"));
		loginpage = new LoginPage(driver);
	}
	
	@Test (priority=1)
	public void login() {
		loginpage.enterUserName(config.getProperty("username"));
		loginpage.enterPassword(config.getProperty("password"));
		loginpage.clickLoginButton();
	}
	
	@Test (priority=2)
	public void upsell() {
		upsellpage.clickUpsellMenu();
		upsellpage.clickCampaignsTab();
	}
	
	
	
}

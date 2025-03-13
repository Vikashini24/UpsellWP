package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ConfigData;

public class CampaignsPage extends BasePage {
	
	ConfigData config = new ConfigData();
	
	@FindBy(css=".create-campaign")
	WebElement createCampaignButton;
	
	//div[@class='card-body py-1 px-4 text-center']/following-sibling::button/parent::a/div/h4[text()='Checkout Upsells']
	//div[@class='card-body py-1 px-4 text-center']/following-sibling::button/parent::a/div/h4[text()='" + campaignname + "']
	//div[@class='card-body py-1 px-4 text-center']/following-sibling::button/parent::a//h4[contains(text(),'" + campaignname + "')]
	String campaignsName = config.getProperty("campaigns");
	
	//tr[@data-title='Email Upsell']/td/div/input[@name='enabled']
	
	
	public CampaignsPage(WebDriver driver) {
		super(driver);
	}
	
	public void createCampaigns() {
		createCampaignButton.click();
		//WebElement campaigns = driver.findElement(By.xpath("//div[@class='card-body py-1 px-4 text-center']/following-sibling::button/parent::a/div/h4[text()='Checkout Upsells']"));
		WebElement campaigns = driver.findElement(By.xpath("//div[@class='card-body py-1 px-4 text-center']/following-sibling::button/parent::a/div/h4[text()='" + campaignsName + "']"));
		campaigns.click();
	}
	
	
}

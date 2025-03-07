package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignsPage extends BasePage {
	
	@FindBy(css=".create-campaign")
	WebElement createCampaignButton;
	
	
	
	
	public CampaignsPage(WebDriver driver) {
		super(driver);
	}
	
	
	
}

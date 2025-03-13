package pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigData;

public class CheckoutUpsell extends BasePage {
	
	CampaignsPage campaignspage = new CampaignsPage(driver);
	ConfigData config = new ConfigData();
	
	@FindBy(xpath="//span[text()='Checkout Upsells']")
	WebElement campaignNameText;
	
	@FindBy(id="title")
	WebElement campaignTitleField;
	
	@FindBy(id="offer-display-location")
	WebElement displayLocationDropdown;
	
	@FindBy(id="offer-display-method")
	WebElement displayMethodDropdown;
	
	@FindBy(id="cuw-offers")
	List<WebElement> offersList;
	
	@FindBy(id="offer-add")
	WebElement addOfferButton;
	
	@FindBy(id="offer-product")
	WebElement chooseProductField;
	
	@FindBy(id="offer-product-qty")
	WebElement quantityField;
	
	@FindBy(id="offer-discount-type")
	WebElement discountTypeDropdown;
	
	@FindBy(id="offer-discount-value")
	WebElement discountValueField;
	
	@FindBy(id="offer-limit")
	WebElement overallUsageLimitField;
	
	@FindBy(id="offer-limit-per-user")
	WebElement usageLimitPerCustomerField;
	
	
	public CheckoutUpsell(WebDriver driver) {
		super(driver);
	}
	
	public void enterCampaignName() {
		if((campaignspage.campaignsName).equals(campaignNameText)) {
			campaignTitleField.sendKeys(config.getProperty("campaigns"));
		}
	}
	
	public void selectDisplayLocation() {
		Select dropdown = new Select(displayLocationDropdown);
		dropdown.selectByVisibleText("Before Payment Gateways");
	}
	
	public void selectDisplayMethod() {	
		Select dropdown = new Select(displayMethodDropdown);
		dropdown.selectByValue("all");
	}
	
	public void listOfOffers() {
		int offerCount = offersList.size();
		if(offerCount<10) {
			addOfferButton.click();
		}
		
	}
	
}

package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ConfigData;

public class CommonFields extends BasePage{
	
	ConfigData config = new ConfigData();
	
	@FindBy(id="switch-campaign-enable")
	WebElement campaignStatusToggle;
	
	@FindBy(id="campaign-save")
	WebElement campaignSaveButton;
	
	@FindBy(id="campaign-save-close")
	WebElement camapignSaveCloseButton;
	
	@FindBy(id="priority")
	WebElement priorityField;
	
	@FindBy(id="date-from")
	WebElement startDateField;
	
	@FindBy(id="toggle-end-date")
	WebElement setEndDateCheckbox;
	
	@FindBy(id="date-to")
	WebElement endDateField;
	
	@FindBy(id="accordion")
	WebElement tutorialsTab;
	
	@FindBy(id="cuw_tutorials")
	WebElement tutorialsBox;
	
	@FindBy(css=".cuw-videos")
	WebElement videos;
	
	@FindBy(css=".cuw-documents mt-3")
	WebElement documentation;
	
	@FindBy(id="offer-close")
	WebElement closeOfferButton;
	
	@FindBy(id="offer-save")
	WebElement saveOfferButton;
	
	
	public CommonFields(WebDriver driver) {
		super(driver);
	}
	
	public void saveCampaign() {
		if(campaignStatusToggle.isDisplayed()) {
			camapignSaveCloseButton.click();
		}
	}
	
	public void setPriority() {
		priorityField.sendKeys(config.getProperty("priority"));
	}
	
	public void schedule() {
		startDateField.sendKeys(config.getProperty("startdate"));
		startDateField.sendKeys(Keys.ENTER);
		setEndDateCheckbox.click();
		endDateField.sendKeys(config.getProperty("enddate"));
		endDateField.sendKeys(Keys.ENTER);
	}
	
	public void checkTutorials() {
		boolean tutorials = tutorialsBox.isDisplayed();
		if(tutorials==false) {
			tutorialsTab.click();
			videos.isDisplayed();
			documentation.isDisplayed();
		}
	}
	
	public void closeOffer() {
		closeOfferButton.click();
	}
	
	public void saveOffer() {
		saveOfferButton.click();
	}
	
}

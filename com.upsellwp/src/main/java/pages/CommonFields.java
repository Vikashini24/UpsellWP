package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonFields extends BasePage{
	
	
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
	
	
	public CommonFields(WebDriver driver) {
		super(driver)
	}
	
	public void checkCampaignsStatus() {
		
	}
	
}

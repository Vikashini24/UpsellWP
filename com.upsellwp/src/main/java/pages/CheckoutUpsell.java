package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutUpsell extends BasePage {
	
	
	@FindBy(xpath="//span[text()='Checkout Upsells']")
	WebElement campaignNameText;
	
	@FindBy(id="title")
	WebElement campaignTitleField;
	
	@FindBy(id="offer-display-location")
	WebElement displayLocationDropdown;
	
	@FindBy(id="offer-display-method")
	WebElement displayMethodDropdown;
	
	
	
	
	
	
	public CheckoutUpsell(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	
}

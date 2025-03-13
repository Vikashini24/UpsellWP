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
	
	@FindBy(id="cuw-offers")
	WebElement offersList;
	
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
	
	
	
	
	
}

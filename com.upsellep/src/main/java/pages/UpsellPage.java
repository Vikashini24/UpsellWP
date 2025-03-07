package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsellPage extends BasePage {
	
	@FindBy(linkText="admin.php?page=checkout-upsell-woocommerce")
	WebElement upsellMenu;
	
	@FindBy(linkText="admin.php?page=checkout-upsell-woocommerce&tab=campaigns")
	WebElement campaignsTab;
	
	
	public UpsellPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickUpsellMenu() {
		upsellMenu.click();
	}
	
	public void clickCampaignsTab() {
		campaignsTab.click();
	}
	
	
	
}

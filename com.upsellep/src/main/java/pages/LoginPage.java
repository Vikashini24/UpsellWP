package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(id="user_login")
	WebElement userNameField;
	
	@FindBy(id="user_pass")
	WebElement passwordField;
	
	@FindBy(css=".dashicons.dashicons-visibility")
	WebElement visibilityIcon;
	
	@FindBy(id="rememberme")
	WebElement rememberMeCheckbox;
	
	@FindBy(id="wp-submit")
	WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void enterUserName(String username) {
			userNameField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickVisibility() {
		visibilityIcon.click();
	}
	
	public void clickRememberMe() {
		rememberMeCheckbox.click();
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
	
}

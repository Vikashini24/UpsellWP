package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Conditions extends BasePage{
	
	
	@FindBy(id="add-condition")
	WebElement addConditionButton;
	
	@FindBy(xpath="//div[@id='condition-type']/select")
	WebElement chooseConditionDropdown;
	
	
	
	public Conditions(WebDriver driver) {
		super(driver);
	}
	
	public void addCondition() {
		addConditionButton.click();
	}
	
	public void chooseCondition() {
		Select dropdown = new Select(chooseConditionDropdown);
		
	}
	
}

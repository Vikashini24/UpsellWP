package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Conditions extends BasePage{
	
	Select conditionsdropdown;
	Select conditionsListDropdown;
	Select lineItemNumberListDropdown;
	
	@FindBy(id="add-condition")
	WebElement addConditionButton;
	
	@FindBy(xpath="//div[@id='condition-type']/select")
	WebElement chooseConditionDropdown;
	
	@FindBy(xpath="//div[@class='condition-method flex-fill']/select")
	WebElement chooseConditionsListDrodown;
	
	@FindBy(xpath="//div[@class='condition-operator flex-fill']/select")
	WebElement chooseLineItemNumberList;
	
	
	public Conditions(WebDriver driver) {
		super(driver);
		conditionsdropdown = new Select(chooseConditionDropdown);
		conditionsListDropdown = new Select(chooseConditionsListDrodown);
		lineItemNumberListDropdown = new Select(chooseLineItemNumberList);
	}
	
	public void addCondition() {
		addConditionButton.click();
	}
	
	//Conditions type
	public void productsInTheCart() {
		conditionsdropdown.selectByVisibleText("Products in the Cart");
	}
	
	public void categoriesInTheCart() {
		conditionsdropdown.selectByVisibleText("Categories of items in the Cart");
	}
	
	public void tagsOfItemsinTheCart() {
		conditionsdropdown.selectByVisibleText("Tags of items in the Cart");
	}
	
	public void skusInTheCart() {
		conditionsdropdown.selectByVisibleText("Product SKUs in the Cart");
	}
	
	public void lineItem() {
		conditionsdropdown.selectByVisibleText("Number of line items in the Cart");
	}
	
	public void cartItems() {
		conditionsdropdown.selectByVisibleText("Cart items quantity");
	}
	
	public void coupons() {
		conditionsdropdown.selectByVisibleText("Applied Coupons in the Cart");
	}
	
	public void cartSubtotal() {
		conditionsdropdown.selectByVisibleText("Cart subtotal");
	}
	
	public void firstOrder() {
		conditionsdropdown.selectByVisibleText("First order");
	}
	
	public void orderMade() {
		conditionsdropdown.selectByVisibleText("Number of orders made");
	}
	
	public void ordersMadeWithSpecificProducts() {
		conditionsdropdown.selectByVisibleText("Number of orders made with specific products");
	}
	
	public void totalSpent() {
		conditionsdropdown.selectByVisibleText("Total spent");
	}
	
	public void userRole() {
		conditionsdropdown.selectByVisibleText("User role");
	}
	
	public void userLoggedIn() {
		conditionsdropdown.selectByVisibleText("User logged in");
	}
	
	public void specificUsers() {
		conditionsdropdown.selectByVisibleText("Specific users");
	}
	
	public void time() {
		conditionsdropdown.selectByVisibleText("Time");
	}
	
	public void days() {
		conditionsdropdown.selectByVisibleText("Days");
	}
	
	public void brands() {
		conditionsdropdown.selectByVisibleText("Brands");
	}
	
	//ConditionsList
	public void inList() {
		conditionsListDropdown.selectByVisibleText("In list");
	}
	
	public void notInList() {
		conditionsListDropdown.selectByVisibleText("Not in list");
	}
	
	//cart list
	public void greaterThanEqualTo() {
		lineItemNumberListDropdown.selectByVisibleText("Greater than or equal to (>=)");
	}
	
	public void greaterThan() {
		lineItemNumberListDropdown.selectByVisibleText("Greater than (>)");
	}
	
	public void lessThanEqualTo() {
		lineItemNumberListDropdown.selectByVisibleText("Less than or equal to (<=)");
	}
	
	public void lessThan() {
		lineItemNumberListDropdown.selectByVisibleText("Less than (<)");
	}
	
	public void equalTo() {
		lineItemNumberListDropdown.selectByVisibleText("Equal to (=)");
	}
	
	public void range() {
		lineItemNumberListDropdown.selectByVisibleText("Range (from-to)");
	}
	
	//
	
	
}

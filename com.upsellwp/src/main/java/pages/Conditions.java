package pages;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigData;

public class Conditions extends BasePage{
	
	ConfigData config = new ConfigData();
	
	Select conditionsdropdown;
	Select conditionsListDropdown;
	Select lineItemNumberListDropdown;
	Select orderStatusDropdown;
	
	@FindBy(id="add-condition")
	WebElement addConditionButton;
	
	@FindBy(xpath="//div[@id='condition-type']/select")
	WebElement chooseConditionDropdown;
	
	@FindBy(xpath="//div[@class='condition-method flex-fill']/select")
	WebElement chooseConditionsListDrodown;
	
	@FindBy(xpath="//div[@class='condition-operator flex-fill']/select")
	WebElement chooseLineItemNumberList;
	
	@FindBy(xpath="//div[@class='condition-value']/input")
	WebElement totalAmountField;
	
	@FindBy(xpath="//div[@class='condition-values']/select")
	WebElement orderStatusField;
	
	@FindBy(xpath="//ul/li/input[@placeholder=' Choose products']")
	WebElement specificProductsField;
	
	@FindBy(xpath="//ul/li/input[@placeholder=' Choose users']")
	WebElement chooseUserField;
	
	@FindBy(name="conditions[1742281506484][values][from]")
	WebElement fromTimeField;
	
	@FindBy(name="conditions[1742281506484][values][to]")
	WebElement toTimeField;
	
	@FindBy(id="slider-condition-add")
	WebElement conditionSaveButton;
	
	@FindBy(id="cuw-condition-close")
	WebElement conditionCloseButton;
	
	
	public Conditions(WebDriver driver) {
		super(driver);
		conditionsdropdown = new Select(chooseConditionDropdown);
		conditionsListDropdown = new Select(chooseConditionsListDrodown);
		lineItemNumberListDropdown = new Select(chooseLineItemNumberList);
		orderStatusDropdown = new Select(orderStatusField); 
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
	
	//Coupons list
	//InList NotinList - above
	public void anyCoupon() {
		conditionsListDropdown.selectByVisibleText("Any coupon");
	}
	
	public void noCoupons() {
		conditionsListDropdown.selectByVisibleText("No coupons");
	}
	
	//FirstOrder
	public void firstorderYes() {
		conditionsListDropdown.selectByVisibleText("Yes");
	}
	
	public void firstorderNo() {
		conditionsListDropdown.selectByVisibleText("No");
	}
	
	//Number of orders made
	 public void currentDay() {
		 lineItemNumberListDropdown.selectByVisibleText("Current day");
	 }
	 
	 public void currentWeek() {
		 lineItemNumberListDropdown.selectByVisibleText("Current week");
	 }
	 
	 public void currentMonth() {
		 lineItemNumberListDropdown.selectByVisibleText("Current month");
	 }
	 
	 public void currentYear() {
		 lineItemNumberListDropdown.selectByVisibleText("Current year");
	 }
	 
	 public void oneDay() {
		 lineItemNumberListDropdown.selectByVisibleText("1 day");
	 }
	 
	 public void twoDays() {
		 lineItemNumberListDropdown.selectByVisibleText("2 days");
	 }
	 
	 public void threeDays() {
		 lineItemNumberListDropdown.selectByVisibleText("3 days");
	 }
	 
	 public void fourDays() {
		 lineItemNumberListDropdown.selectByVisibleText("4 days");
	 }
	 
	 public void fiveDays() {
		 lineItemNumberListDropdown.selectByVisibleText("5 days");
	 }
	 
	 public void sixDays() {
		 lineItemNumberListDropdown.selectByVisibleText("6 days");
	 }
	 
	 public void oneWeek() {
		 lineItemNumberListDropdown.selectByVisibleText("1 week");
	 }
	 
	 public void twoWeeks() {
		 lineItemNumberListDropdown.selectByVisibleText("2 weeks");
	 }
	 
	 public void threeWeeks() {
		 lineItemNumberListDropdown.selectByVisibleText("3 weeks");
	 }
	 
	 public void fourWeeks() {
		 lineItemNumberListDropdown.selectByVisibleText("4 weeks");
	 }
	 
	 public void oneMonth() {
		 lineItemNumberListDropdown.selectByVisibleText("1 month");
	 }
	 
	 public void twoMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("2 months");
	 }
	 
	 public void threeMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("3 months");
	 }
	 
	 public void fourMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("4 months");
	 }
	 
	 public void fiveMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("5 months");
	 }
	 
	 public void sixMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("6 months");
	 }
	 
	 public void sevenMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("7 months");
	 }
	 
	 public void eightMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("8 months");
	 }
	 
	 public void nineMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("9 months");
	 }
	 
	 public void tenMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("10 months");
	 }
	 
	 public void elevenMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("11 months");
	 }
	 
	 public void twelveMonths() {
		 lineItemNumberListDropdown.selectByVisibleText("12 months");
	 }
	 
	 public void twoYears() {
		 lineItemNumberListDropdown.selectByVisibleText("2 years");
	 }
	 
	 public void threeYears() {
		 lineItemNumberListDropdown.selectByVisibleText("3 years");
	 }
	 
	 public void fourYears() {
		 lineItemNumberListDropdown.selectByVisibleText("4 years");
	 }
	 
	 public void fiveYears() {
		 lineItemNumberListDropdown.selectByVisibleText("5 years");
	 }
	 
	 public void sixYears() {
		 lineItemNumberListDropdown.selectByVisibleText("6 years");
	 }
	 
	 public void sevenYears() {
		 lineItemNumberListDropdown.selectByVisibleText("7 years");
	 }
	 
	 public void eightYears() {
		 lineItemNumberListDropdown.selectByVisibleText("8 years");
	 }
	 
	 public void nineYears() {
		 lineItemNumberListDropdown.selectByVisibleText("9 years");
	 }
	 
	 public void tenYears() {
		 lineItemNumberListDropdown.selectByVisibleText("10 years");
	 }
	 
	public void enterTotalAmount() {
		totalAmountField.sendKeys(config.getProperty("totalamount"));
	}
	
	//OrderStatus
	public void pendingPayment() {
		orderStatusDropdown.selectByVisibleText("Pending payment");
	}
	
	public void processing() {
		orderStatusDropdown.selectByVisibleText("Processing");
	}
	
	public void onHold() {
		orderStatusDropdown.selectByVisibleText("On hold");
	}
	
	public void completed() {
		orderStatusDropdown.selectByVisibleText("Completed");
	}
	
	public void cancelled() {
		orderStatusDropdown.selectByVisibleText("Cancelled");
	}
	
	public void refunded() {
		orderStatusDropdown.selectByVisibleText("Refunded");
	}
	
	public void failed() {
		orderStatusDropdown.selectByVisibleText("Failed");
	}
	
	public void draft() {
		orderStatusDropdown.selectByVisibleText("Draft");
	}
	
	//Number of orders made with specific products
	public void enterSpecificProducts() {
		specificProductsField.sendKeys(config.getProperty("specificproduct"));
		specificProductsField.sendKeys(Keys.ENTER);
	}
	
	public void enterValue() {
		totalAmountField.sendKeys(config.getProperty("value"));
	}
	
	//User role - choose roles
	public void admin() {
		orderStatusDropdown.selectByVisibleText("Administrator");
	}
	
	public void editor() {
		orderStatusDropdown.selectByVisibleText("Editor");
	}
	
	public void author() {
		orderStatusDropdown.selectByVisibleText("Author");
	}
	
	public void contributor() {
		orderStatusDropdown.selectByVisibleText("Contributor");
	}
	
	public void subscriber() {
		orderStatusDropdown.selectByVisibleText("Subscriber");
	}
	
	public void customer() {
		orderStatusDropdown.selectByVisibleText("Customer");
	}
	
	public void shopManager() {
		orderStatusDropdown.selectByVisibleText("Shop manager");
	}
	
	public void translator() {
		orderStatusDropdown.selectByVisibleText("Translator");
	}
	
	public void affiliate() {
		orderStatusDropdown.selectByVisibleText("Affiliate");
	}
	
	public void guest() {
		orderStatusDropdown.selectByVisibleText("Guest");
	}
	
	//Specific user - choose users
	public void enterChooseUsers() {
		chooseUserField.sendKeys(config.getProperty("users"));
		chooseUserField.sendKeys(Keys.ENTER);
	}
	
	//Time
	public void timeIn() {
		conditionsListDropdown.selectByVisibleText("In");
	}
	
	public void timeNotIn() {
		conditionsListDropdown.selectByVisibleText("Not In");
	}
	
	public void enterFromTime() {
		fromTimeField.sendKeys(config.getProperty("fromtime"));
	}
	
	public void enterToTime() {
		toTimeField.sendKeys(config.getProperty("totime"));
	}
	
	//Days - choose days
	public void sunday() {
		orderStatusDropdown.selectByVisibleText("Sunday");
	}
	
	public void monday() {
		orderStatusDropdown.selectByVisibleText("Monday");
	}
	
	public void tuesday() {
		orderStatusDropdown.selectByVisibleText("Tuesday");
	}
	
	public void wednesday() {	
		orderStatusDropdown.selectByVisibleText("Wednesday");
	}
	
	public void thursday() {
		orderStatusDropdown.selectByVisibleText("Thursday");
	}
	
	public void friday() {
		orderStatusDropdown.selectByVisibleText("Friday");
	}
	
	public void saturday() {
		orderStatusDropdown.selectByVisibleText("Saturday");
	}
	
	//Brands - choose taxonomies
	public void enterTaxonomy() {
		orderStatusField.sendKeys(config.getProperty("taxonomy"));
		orderStatusField.sendKeys(Keys.ENTER);
	}
	
	//Save button
	public void clickConditionSaveButton() {
		if(conditionSaveButton.isDisplayed()) {
			conditionSaveButton.click();
		}
	}
	
	//Close button
	public void clickConditionCloseButton() {
		conditionCloseButton.click();
	}
	
	
}

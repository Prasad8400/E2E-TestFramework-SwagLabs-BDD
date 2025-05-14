package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends BasePage{

	public YourCartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="checkout") WebElement checkout;
	@FindBy(className="title") WebElement title;
	@FindBy(css="input#first-name") WebElement firstName;
	@FindBy(css="input#last-name") WebElement lastName;
	@FindBy(css="input#postal-code") WebElement postalCode;
	@FindBy(name="continue") WebElement continueBttn;
	
	public void clickOn_checkoutBttn() {
		checkout.click();
	}
	public String get_YourCart_Title() {
		return title.getText();
	}
	public void enter_fname(String name) {
		firstName.sendKeys(name);
	}
	public void enter_lname(String lname) {
		lastName.sendKeys(lname);
	}
	public void enter_pcode(String code) {
		postalCode.sendKeys(code);
	}
	public void clickOn_continueBttn() {
		continueBttn.click();
	}
	
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BasePage{

	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="complete-header") WebElement successMsg;
	@FindBy(id="back-to-products") WebElement backToHome;
	
	public String get_successMsg() {
		return successMsg.getText();
	}
	public void clickOn_BackToHomeBttn() {
		backToHome.click();
	}
}

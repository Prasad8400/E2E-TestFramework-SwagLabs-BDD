package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage extends BasePage {

	public CheckOutOverviewPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="title") WebElement Title;
	@FindBy(className="inventory_item_name") WebElement ItemName;
	@FindBy(className="inventory_item_desc") WebElement ItemDesc;
	@FindBy(className="inventory_item_price") WebElement ItemPrice;
	@FindBy(id="finish") WebElement finishBttn;
	
	public String get_Title() {
		return Title.getText();
	}
	public String get_ItemName() {
		return ItemName.getText();
	}
	public String get_ItemDesc() {
		return ItemDesc.getText();
	}
	public String get_ItemPrice() {
		return ItemPrice.getText().replace("\n", "");
	}
	public void clickOn_finishBttn() {
		finishBttn.click();
	}
}

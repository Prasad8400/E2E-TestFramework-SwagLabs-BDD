package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BasePage{

	public AddToCartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="add-to-cart-sauce-labs-backpack") public WebElement SauceLabsBackpack;
	@FindBy(id="add-to-cart-sauce-labs-bike-light") WebElement SauceLabsBikeLight;
	@FindBy(xpath="//*[@class='shopping_cart_badge']") WebElement ShoppingCartbadge;
	@FindBy(css="button#remove-sauce-labs-bike-light") WebElement removeSauceLabsBikeLight;
	@FindBy(className="shopping_cart_container") WebElement CartIcon;

	public void AddToCart_Backpack() {
		SauceLabsBackpack.click();
	}
	public void AddToCart_BikeLight() {
		SauceLabsBikeLight.click();
	}
	public String get_CountOfShoppingCartbadge() {
		return ShoppingCartbadge.getText();
	}
	public void RemoveFromCart_BikeLight() {
		removeSauceLabsBikeLight.click();
	}
	public void clickOn_CartIcon() {
		CartIcon.click();
	}
}

package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.AddToCartPage;

public class AddToCartSteps extends BaseTest {

    AddToCartPage cartPage = new AddToCartPage(driver);

    @When("I add backpack to the cart")
    public void i_add_backpack_to_the_cart() {
        cartPage.AddToCart_Backpack();
    }

    @Then("the cart should have {int} items")
    public void the_cart_should_have_item(int count) {
        Assert.assertEquals(cartPage.get_CountOfShoppingCartbadge(), String.valueOf(count));
    }

    @When("I add bike light to the cart")
    public void i_add_bike_light_to_the_cart() {
        cartPage.AddToCart_BikeLight();
    }

    @When("I remove bike light from the cart")
    public void i_remove_bike_light_from_the_cart() {
        cartPage.RemoveFromCart_BikeLight();
    }

    @And("I open the cart")
    public void i_open_the_cart() {
        cartPage.clickOn_CartIcon();
    }
}

package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.YourCartPage;
import utils.ConfigReader;

public class YourCartSteps extends BaseTest {

    YourCartPage cartPage = new YourCartPage(driver);

    @When("I click checkout")
    public void i_click_checkout() {
        cartPage.clickOn_checkoutBttn();
    }

    @Then("I should be on Checkout Your Information page")
    public void i_should_be_on_checkout_info_page() {
        Assert.assertEquals(cartPage.get_YourCart_Title(), "Checkout: Your Information");
    }

    @And("I enter shipping information")
    public void i_enter_shipping_info() {
        cartPage.enter_fname(ConfigReader.get("firstName"));
        cartPage.enter_lname(ConfigReader.get("lastName"));
        cartPage.enter_pcode(ConfigReader.get("postalCode"));
    }

    @And("I click continue")
    public void i_click_continue() {
        cartPage.clickOn_continueBttn();
    }
}

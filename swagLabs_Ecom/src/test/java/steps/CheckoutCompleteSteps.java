package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.CheckOutOverviewPage;
import pages.CheckoutCompletePage;
import pages.AddToCartPage;

public class CheckoutCompleteSteps extends BaseTest {

    CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
    CheckOutOverviewPage overviewPage = new CheckOutOverviewPage(driver);
    AddToCartPage addCartPage = new AddToCartPage(driver);

    @Then("I should see order completion page")
    public void i_should_see_order_completion_page() {
        Assert.assertEquals(overviewPage.get_Title(), "Checkout: Complete!");
    }

    @And("I should see a thank you message")
    public void i_should_see_thank_you_message() {
        Assert.assertEquals(completePage.get_successMsg(), "Thank you for your order!");
    }

    @And("I go back to home page")
    public void i_go_back_to_home() {
        completePage.clickOn_BackToHomeBttn();
    }

    @Then("I should see the backpack on home")
    public void i_see_backpack_on_home() {
        Assert.assertTrue(addCartPage.SauceLabsBackpack.isDisplayed());
    }
}

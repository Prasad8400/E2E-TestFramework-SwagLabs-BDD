package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.CheckOutOverviewPage;

public class CheckOutOverviewSteps extends BaseTest {

    CheckOutOverviewPage page = new CheckOutOverviewPage(driver);

    @Then("I should see the checkout overview page")
    public void i_should_see_checkout_overview() {
        Assert.assertEquals(page.get_Title(), "Checkout: Overview");
    }

    @And("I should see correct item name, description and price")
    public void i_should_see_item_details() {
        Assert.assertEquals(page.get_ItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(page.get_ItemDesc(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        Assert.assertEquals(page.get_ItemPrice(), "$29.99");
    }

    @When("I click finish")
    public void i_click_finish() {
        page.clickOn_finishBttn();
    }
}

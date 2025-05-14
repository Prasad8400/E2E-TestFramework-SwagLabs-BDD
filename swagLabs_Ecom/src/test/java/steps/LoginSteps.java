package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReportManager;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get(ConfigReader.get("baseUrl"));
        loginPage = new LoginPage(driver);
        ReportManager.log("Navigated to login page");
    }

    @Then("I should see the site header")
    public void i_should_see_the_site_header() {
        Assert.assertEquals(loginPage.getHeaderTitle(), ConfigReader.get("siteName"));
    }

    @When("I login with invalid password")
    public void i_login_with_invalid_password() {
        loginPage.loginSwagLab(ConfigReader.get("username"), ConfigReader.get("wrongpass"));
    }

    @Then("I should see the error message")
    public void i_should_see_the_error_message() {
        Assert.assertEquals(loginPage.getInvalidCredsMsg(),
                "Epic sadface: Username and password do not match any user in this service");
        ReportManager.pass("Login failed as expected");
    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        loginPage.loginSwagLab(ConfigReader.get("username"), ConfigReader.get("password"));
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.getHeaderTitle(), ConfigReader.get("siteName"));
        ReportManager.pass("Login successful");
    }
}

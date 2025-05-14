package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import base.BaseTest;
import utils.ReportManager;

public class Hooks extends BaseTest {

    @Before
    public void setUp(Scenario scenario) {
        // Initialize WebDriver if not already initialized
        setup();  // Call the setup method from BaseTest

        ReportManager.startTest(scenario.getName());
        ReportManager.log("Starting scenario: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        // Capture the result of the scenario and log it
        if (scenario.isFailed()) {
            ReportManager.fail("Scenario failed: " + scenario.getName());
        } else {
            ReportManager.pass("Scenario passed");
        }

        // Optionally, you can add a wait to ensure that the test ends smoothly
        ReportManager.flush();
    }

    @AfterAll
    public static void afterAll() {
        // Instantiate BaseTest and call non-static tearDown
        BaseTest baseTest = new BaseTest();
        baseTest.tearDown();
    }
}

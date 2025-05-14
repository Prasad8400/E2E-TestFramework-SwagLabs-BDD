package base;

import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.ReportManager;

public class BaseTest {

    protected static WebDriver driver;

    // You can now initialize WebDriver only once for the entire test lifecycle
    public void setup() {
        if (driver == null) {  // Only initialize once
            if (ConfigReader.get("browser").equalsIgnoreCase("chrome")) {
                SetDriver driverSetup = new SetChromeDriver();
                driver = driverSetup.initDriver();
            } else if (ConfigReader.get("browser").equalsIgnoreCase("firefox")) {
                SetDriver driverSetup = new SetFirefoxDriver();
                driver = driverSetup.initDriver();
            } else {
                System.out.println("Invalid browser selection....");
            }
        }
    }

    // Make tearDown static as well
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        ReportManager.flush();
    }
}

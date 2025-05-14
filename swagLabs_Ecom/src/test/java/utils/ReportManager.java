package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {
    private static final ExtentReports extentReports = new ExtentReports();
    private static final ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
    private static final String reportDir = System.getProperty("user.dir") + "/test-output";
    private static final String reportPath = reportDir + "/ExtentReport.html";

    static {
        createReportDirectory(reportDir);

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setReportName("Automation Test Report");
        sparkReporter.config().setDocumentTitle("Test Execution Report");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("User", System.getProperty("user.name"));
    }

    private static void createReportDirectory(String path) {
        File reportFolder = new File(path);
        if (!reportFolder.exists()) {
            reportFolder.mkdirs();
        }
    }

    public static void startTest(String testName) {
        ExtentTest test = extentReports.createTest(testName);
        testThread.set(test);
    }

    public static void log(String message) {
        if (testThread.get() != null) {
            testThread.get().info(message);
        }
    }

    public static void pass(String message) {
        if (testThread.get() != null) {
            testThread.get().pass(message);
        }
    }

    public static void fail(String message) {
        if (testThread.get() != null) {
            testThread.get().fail(message);
        }
    }

    public static void flush() {
        extentReports.flush();
    }

    public static ExtentTest getTest() {
        return testThread.get();
    }
}

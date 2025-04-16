package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;
import pages.BasePage;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            new BasePage().takeScreenshotWithTestName(result.getMethod().getMethodName());
        }
        DriverUtils.quitDriver();
    }

}

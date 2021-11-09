package com.gs.automation.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;

/**
 * This class is created for using browser methods and logging the reports
 *
 * @author Swati.Chawla
 */
public class TestBase {

    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    /**
     * This method is used for initializing browser and
     * creating the extent report .
     */
    @BeforeClass
    public void setUp() {

        extentReports = new ExtentReports(System.getProperty("user.dir") + "/test-output/LogGeneration.html");

    }

    /**
     * This method is used for closing browser and
     * closing the extent report.
     */
    @AfterClass
    public void tearDown() {

        extentReports.endTest(extentTest);
        extentTest.log(LogStatus.INFO, "Test Execution Ends");
        extentReports.flush();
        extentReports.close();
    }

}

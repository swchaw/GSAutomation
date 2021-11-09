package com.gs.automation.constants;

import java.io.File;

/**
 * This class contains the constants for the project
 *
 * @author Swati.Chawala
 */
public class j {

    public final static int EXPLICIT_TIME_OUT = 30;
    public static final String ENVIRONMENT_KEY = "env";
    public static final String CHROME_BROWSER = "chrome";
    public static final String FIREFOX_BROWSER = "fireFox";
    public static final String INTERNET_EXPLORER_BROWSER = "internetExplorer";
    public static final int IMPLICIT_WAIT = 120;

    // Test case related constants
    public static final String RUN_ID = "Run ID";
    public static final String ENVIRONMENT = "Environment";
    public static final String PHASE = "Phase";
    public static final String START_TIME = "Start Time";
    public static final String END_TIME = "End Time";
    public static final String TOTAL_TESTS = "Total Test Cases";
    public static final String TOTAL_PASS = "Total Pass";
    public static final String TOTAL_FAIL = "Total Fail";
    public static final String TOTAL_SKIP = "Total Skip";
    public static final String TEST_CASE_NAME = "Test Case Name";
    public static final String TOTAL_TIME_TAKEN = "Total time taken";
    public static final String MODULES = "Modules";
    public static final String BROWSERS = "Browsers";
    public static final String DURATION = "Duration";
    public static final String STATUS = "Status";

    public static final String TEST_DURATION = "Duration";
    public static final String TEST_STATUS = "Status";

    public static final String RESOURCES_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources";
    public static final String MODULE = "Module";
    public static final String BROWSER = "Browser";
    public static final String OS = "OS";
    public static final int TIMEOUT_SECONDS = 5000;
    public final static int WAIT_TIMEOUT_IN_SECONDS = 6000;


    public final static String USER_HOME = System.getProperty("user.dir") + File.separator;
    public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "main" + File.separator + "resources" + File.separator;
    public final static String CONFIG_FILE = RESOURCES_HOME + "config.properties";
    public static final String DOWNLOAD_PATH = RESOURCES_HOME + "downloads";
    public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
    public final static String TESTDATA_HOME = RESOURCES_HOME + "testdata" + File.separator;
    public final static String EXTENT_REPORT = RESOURCES_HOME + "extentreport" + File.separator + "extentreport";

    /**
     * These are falcon project constant
     *
     * @author Mohit
     */
    public static final String FALCON_LOCATOR_FILE = RESOURCES_HOME + File.separator + "locators" + File.separator + "falconprojectpage.properties";
    public static final String FALCON_VALIDATION_FILE = RESOURCES_HOME + File.separator + "testdata" + File.separator + "falconproject.properties";


    /**
     * This are makemytrip project constants
     *
     * @Rishav Kumar
     */

    public final static String MMT_LOCATOR_FILE = LOCATOR_HOME + "makemytripprojectpage.properties";
    public final static String MMT_VALIDATION_FILE = TESTDATA_HOME + "makemytripproject.properties";
    public final static String MMT_EXCEL_FILE = DOWNLOAD_PATH + File.separator + "Test Report.xlsx";


    /**
     * These are falcon project constant
     *
     * @author Hari Krishna
     */
    public static final String PROPERTIES_PATH = RESOURCES_PATH + File.separator + "locators" + File.separator + "falcondemo.properties";

    /**
     * These are falcon project constant
     *
     * @author Swati Chawla
     */
    public static final String FALCON_DEMO_PROPERTIES_FILE_PATH = RESOURCES_PATH + File.separator + "locators" + File.separator + "falcondemofile.properties";
    public static final String ERROR_MESSAGE = "Exception Message";
    public static final String READ_EXCEL = "Read Excel";
    public static final String TEST_CASES = "Test Cases";
    public static final String TEST_REPORT = "Test Report";
    public static final String BROWSER_NAME_KEY = "browser.name";
    public static final String PROJECT_NAME_CLICK = "Project Name Clicked..";
    public static final String EXCEL_DOWNLOADING = "Downloading Excel...";
    public static final String EXCEL_DOWNLOADED = "Excel Downloaded!";
    public static final String TEST_OUTPUT_PATH = "/test-output/LogGeneration.html";
    public static final String USER_DIR = "user.dir";
    public static final String TOGGLE_CLICK = "Clicking on toggle button to see hidden fields... ";
}


package com.gs.automation.testscripts;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.io.IOException;

public class GS {
    /**
     * This method calls google dashboard
     */
    @Test
    public void verifyGS() throws IOException, ParseException {
// Testing Commits and merging
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver","C:\\Users\\swati.chawla\\DriverCrom\\chromedriver.exe");
        //Instantiating driver object and launching browser
        WebDriver driver1 = new ChromeDriver();
        String url = " https://www.google.com";
        driver1.get(url);
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("C:\\Users\\swati.chawla\\sample\\src\\main\\java\\com\\gs\\automation\\temp.json"));
        JSONObject jsonObject = (JSONObject) obj;

        jsonObject.get("search-text2");
        System.out.println(jsonObject.get("search-text2"));

        WebElement searchbox= driver1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchbox.sendKeys("selenium java search ");
        //Closing the browser
        WebElement googleSearchbutton= driver1.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
        googleSearchbutton.click();
        //driver.quit();
    }
}

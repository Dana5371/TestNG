package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseTest {
    WebDriver driver;
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        String platform = "Cloud";

        if(platform.equals("Cloud")){
            driver = getCloudDriver();
        }else {
            driver = getLocalDriver();
        }
        driver.get("https://www.ebay.com");
    }
    public WebDriver getCloudDriver() throws MalformedURLException {

        String URL = "https://" + "danakernurlanova_OFo351" +
                ":" + "9bvevQtPJRx5XNyVvdgy" + "@hub-cloud.browserstack.com/wd/hub";

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, String> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-UFVYP");
        sauceOptions.put("name", "Chrome Browser Parallel Execution");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL(URL);
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }
    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    @AfterSuite
    public void cleanUp() {
        driver.quit();
    }
}

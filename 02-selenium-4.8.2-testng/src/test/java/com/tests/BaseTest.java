package com.tests;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname

        String host = "localhost";
        Capabilities dc;

        if(System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = new FirefoxOptions();
        }else{
            List<String> options = new ArrayList<>();
            options.add("--disable-extensions");
            options.add("--headless");
            options.add("--disable-gpu");
            options.add("--no-sandbox");
            options.add("--incognito");
            options.add("--disable-application-cache");
            options.add("--disable-dev-shm-usage");
            dc = new ChromeOptions().addArguments(options);
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }

}

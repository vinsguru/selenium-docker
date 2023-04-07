package com.test.stepdefs;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverManager {

    private static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    public static WebDriver getDriver() throws Exception {
        WebDriver driver = DRIVERS.get();
        if(Objects.isNull(driver)){
            DRIVERS.set(setupDriver());
            driver = DRIVERS.get();
        }
        return driver;
    }

    private static WebDriver setupDriver() throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname
        String host = "localhost";
        Capabilities dc;

        if(System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = new FirefoxOptions();
        }else{
            dc = new ChromeOptions();
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        return new RemoteWebDriver(new URL(completeUrl), dc);
    }

    public static void quitDriver(){
        WebDriver driver = DRIVERS.get();
        if(Objects.nonNull(driver)){
            driver.quit();
            DRIVERS.remove();
        }
    }

}

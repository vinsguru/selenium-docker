package com.test.stepdefs;

import com.searchmodule.pages.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchSteps {

    private SearchPage searchPage;
    private WebDriver driver;

    @Given("^I am on the website duck-duck-go$")
    public void launchSite() {
        searchPage = new SearchPage(driver);
        searchPage.goTo();
    }

    @And("^I enter the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        searchPage.doSearch(keyword);
    }

    @And("^I navigate to videos search$")
    public void navigateTovideos()  {
        searchPage.goToVideos();
    }

    @Then("^I should get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        int size = searchPage.getResult();
        Assert.assertTrue(size > min);
    }

    @Before
    public void setupDriver() throws Exception {
        this.driver = WebDriverManager.getDriver();
    }

    @After
    public void quitDriver() {
        WebDriverManager.quitDriver();
    }

}
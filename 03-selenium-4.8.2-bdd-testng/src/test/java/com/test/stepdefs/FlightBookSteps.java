package com.test.stepdefs;

import com.newtours.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FlightBookSteps {

    private WebDriver driver;

    @Given("^I am on flight book page$")
    public void registrationPage() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.goTo();
        registrationPage.enterUserDetails("selenium", "docker");
        registrationPage.enterUserCredentials("selenium", "docker");
        registrationPage.submit();
    }

    @When("^I go to flight details page$")
    public void registrationConfirmationPage(){
        RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
        registrationConfirmationPage.goToFlightDetailsPage();
    }

    @And("^I select the passengers as \"([^\"]*)\"$")
    public void flightDetailsPage(String noOfPassengers){
        FlightDetailsPage flightDetailsPage = new FlightDetailsPage(driver);
        flightDetailsPage.selectPassengers(noOfPassengers);
        flightDetailsPage.goToFindFlightsPage();
    }

    @And("^I go the find flights page$")
    public void findFlightPage(){
        FindFlightPage findFlightPage = new FindFlightPage(driver);
        findFlightPage.submitFindFlightPage();
        findFlightPage.goToFlightConfirmationPage();
    }

    @Then("^Flight confirmation page should show the price as \"([^\"]*)\"$")
    public void flightConfirmationPage(String expectedPrice){
        FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage(driver);
        String actualPrice = flightConfirmationPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice);
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

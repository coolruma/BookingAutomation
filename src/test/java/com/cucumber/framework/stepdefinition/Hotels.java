package com.cucumber.framework.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wools.core.SelTestCase;

public class Hotels extends SelTestCase {

    @Given("^: I am at the hotel home page$")
    public void i_am_at_the_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SelTestCase selTestCase= new SelTestCase();
        selTestCase.setupDriver();
        selTestCase.getWebDriver().get("https://phptravels.com/hotels-module-features/");
    }

    @When("^: I click on the hotel \"([^\"]*)\"$")
    public void i_click_on_the(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^: I should be at the hotel \"([^\"]*)\" page$")
    public void i_should_be_at_the_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}

package com.cucumber.framework.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wools.core.SelTestCase;

public class Tour extends SelTestCase {
    @Given("^: I am at the tour home page$")
    public void i_am_at_the_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SelTestCase selTestCase= new SelTestCase();
        selTestCase.setupDriver();
        selTestCase.getWebDriver().get("https://phptravels.com/tours-module-features/");
    }

    @When("^: I click on the tour \"([^\"]*)\"$")
    public void i_click_on_the(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^: I should be at the tour \"([^\"]*)\" page$")
    public void i_should_be_at_the_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}

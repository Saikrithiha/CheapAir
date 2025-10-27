package com.app.stepdefinition;


import com.app.pageexe.SearchPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends SearchPageExe{
	@Given("Load the url {string}")
	public void load_the_url(String url) {
		driverInit();
		gtUrl(url);
	}
	@When("Enter the source {string}")
	public void enter_the_source(String src) {
	    getSource(src);
	}
	@When("Enter the destination {string}")
	public void enter_the_destination(String dest) {
	   getDestination(dest);
	}
	@When("Select the date {string}")
	public void select_the_date(String date) {
	    getDeptDate(date);
	}
	@When("Select trip {string}")
	public void select(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Select travelers")
	public void select_travelers() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click on Search flights")
	public void click_on_search_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate the result page")
	public void validate_the_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Result page is loaded")
	public void result_page_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click on currency and select {string}")
	public void click_on_currency_and_select(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate that flight rate is displayed in INR")
	public void validate_that_flight_rate_is_displayed_in_inr() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Result page with changed currency is loaded")
	public void result_page_with_changed_currency_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Select the flight with lowest fare")
	public void select_the_flight_with_lowest_fare() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate the flight booking page")
	public void validate_the_flight_booking_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}

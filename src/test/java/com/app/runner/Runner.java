package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ArunKrithiha\\eclipse-workspace\\Selenium\\CheapAir_Cucumber\\src\\test\\java\\com\\app\\feature\\Booking.feature",
	glue ="com.app.stepdefinition",
	monochrome = true
		)

public class Runner {

}

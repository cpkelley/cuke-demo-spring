package com.dealer.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cuke-reports", "json:target/cuke-reports/cucumber.json", "junit:target/failsafe-reports/TEST-cucumber.xml"},
		glue = {"com.dealer.test.stepdefinitions"},
		features = {"classpath:features"})
public class RunCukeDemo {
}

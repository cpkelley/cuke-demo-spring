package com.dealer.test.stepdefinitions;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import com.dealer.test.pageobjects.Page;
import com.dealer.test.seleniumservice.*;

import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



@ContextConfiguration("classpath:cucumber.xml")
public class BaseSteps {
	
	public Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	@Autowired
	CleanBean cleanBean;
	@Autowired
	SeleniumService seleniumService;
	
	
	@Before 
	public void clean() throws Throwable {
		logger.info("Cleaning the Bean");
	}
	
	
	@When("^things are not null") 
	public void not_null() {
		assertThat(seleniumService, is(notNullValue()));
		assertThat(cleanBean, is(notNullValue()));
		
	}
	
	@Given("^service is started$") 
	public void started(){
		assertThat(seleniumService.getDriver(), is(notNullValue()));
	}
	
	@When("^user is set")
	public void user() {
		cleanBean.setUser("blah");
		logger.info("User: " + cleanBean.getUser());
	}

}

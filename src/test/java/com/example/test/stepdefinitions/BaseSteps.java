package com.example.test.stepdefinitions;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.example.test.SomeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



@ContextConfiguration("classpath:cucumber.xml")
public class BaseSteps {
	
	public Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	//@Autowired CleanBean cleanBean;
	CleanBean cleanBean;
	
	@Autowired 
	SomeService someService;
	
	
	public BaseSteps(CleanBean cleanBean) {
		this.cleanBean = cleanBean;
	}
	
	@When("^things are not null") 
	public void not_null() {
		assertThat(someService, is(notNullValue()));
		assertThat(cleanBean, is(notNullValue()));
		
	}
	
	@Given("^service is started$") 
	public void started(){
		assertThat(someService.getStatus(), is(equalTo("started")));
	}
	
	@When("^user is set")
	public void user() {
		cleanBean.setUser("blah");
		logger.info("User: " + cleanBean.getUser());
	}
	
	

}

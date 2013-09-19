package com.example.test.stepdefinitions;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;


import com.example.test.SomeService;
import com.example.test.stepdefinitions.CleanBean;

import cucumber.api.java.en.Then;

@ContextConfiguration("classpath:cucumber.xml")
public class OtherSteps {
	
	
	public Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	@Autowired SomeService someService;
	//@Autowired CleanBean cleanBean; 
	private CleanBean cleanBean;
	
	 
	 public OtherSteps(CleanBean cleanBean) {
		 this.cleanBean = cleanBean;
	 }
	 


	@Then("^there is a user$")
	public void there_is_a_user() throws Throwable {
		assertThat(cleanBean.getUser(), is(equalTo("blah")));
	   
	}
	
	@Then("^there is not a user$")
	public void there_is_not_a_user() throws Throwable {
		assertThat(cleanBean.getUser(), is(nullValue()));

	}
	 


}

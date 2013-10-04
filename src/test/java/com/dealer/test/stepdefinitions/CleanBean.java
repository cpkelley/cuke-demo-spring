package com.dealer.test.stepdefinitions;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;



/**
 * @author ddcchrisk
 * Store any test data that will be shared within a scenario in this test data holder. 
 * This singleton should be reset on a per Scenario basis so that there is no leaking of test data.  
 */

@ContextConfiguration("classpath:cucumber.xml")
public class CleanBean {
	public String user;
	

	public CleanBean() {
		
	}
	
	public CleanBean init() throws Throwable {
		setUser(null);
		return this;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}

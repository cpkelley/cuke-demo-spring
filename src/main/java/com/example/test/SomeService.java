package com.example.test;

import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration("classpath:cucumber.xml")
public class SomeService {
	String status = "not started";
	
	
	public void start() {
		status = "started" ;
	}

	public void stop() {
		status = "stopped" ;
	}
	public String getStatus() {
		return status;
	}

}

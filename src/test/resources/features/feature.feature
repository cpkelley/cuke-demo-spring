Feature: Spring and Pico Container are Not Cool


Scenario: Cool
	Given things are not null
	When user is set
	Then there is a user
	And service is started
	
Scenario: Not Cool
	Given things are not null
	Then service is started
	And there is not a user
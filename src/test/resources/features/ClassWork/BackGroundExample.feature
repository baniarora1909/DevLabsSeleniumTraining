@Alert
Feature: User wants to accept alert and then validate title of the web page

Background:
	Given User launches the URL "url"
	When User clicks on Alert button

Scenario: Test scenario 1
	Given User clicks on Confirm button
	And User accepts the Alert
	Then User verifies the title of the web page
	
Scenario: Test scenario 2
		Given User clicks on Prompt button
		And User enters the "Bani" in the alert's input box
		And User accepts the Alert
		Then User verifies the title of the web page
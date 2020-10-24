@RamQuery
Feature: User wants to accept alert and then validate title of the web page

Background:
	Given User launches the URL "url"
	When User clicks on Alert button
	
Scenario: Test scenario 1
		Given User clicks on Prompt button
		And User enters following value in input box
		|Bani|
		And User accepts the Alert
		Then User verifies the title of the web page
Feature: ScenarioOutline Example

@ScenrioOutlineExample
Scenario Outline: ScenarioOutline Example
	Given User launches the URL "url"
		When User clicks on Alert button
		And User clicks on Prompt button
		And User enters the "<value>" in the alert's input box
		And User accepts the Alert
		Then User verifies the title of the web page
		
		Examples:
		| value | 
		| Bani |
		| Arora | 
		
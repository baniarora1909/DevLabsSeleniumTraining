Feature: LabExercise23

@LabExercise23
Scenario Outline: ScenarioOutline Example
	Given User launches the URL "urlforLabExercise"
		When Click on Sign up here
		And selects "<title>"
     	And enter the First name "<fname>"
     	And enter the Last name "<lname>"
     	And enter the gender "<Gender>"
     	And enter DOB "<DOB>"
     	And Enter SSN "<SSN>"
     	And Enter Email address "<EmailAddress>"
     	And Enter Password "<Password>"
     	And Enter confirm password "<Password>"
     	And User clicks on Next Button
     	Then Verify the title Page

		
		Examples:
		|title|fname|lname|Gender|DOB|SSN|EmailAddress|Password|
		|Ms.|Bani|Arora|female|19/09/1863|123-45-6789|baniArora@gmail.com|Password1|
		|Mr.|Sam|Gill|male|19/09/1878|123-45-6789|sam.gill@gmail.com|Password2|
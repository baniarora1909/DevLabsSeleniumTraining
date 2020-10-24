package stepDefinition.LabExercise;

import DevLabsPages.DbankdemoSignUpHere;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.AssertionsAndVerifications;
import helper.Operations;
import helper.PropertiesHelper;

public class LE23StepDefinition extends Operations{
	
	DbankdemoSignUpHere dbankdemoSignUpHere = new DbankdemoSignUpHere();			
	
	@When("^selects \"([^\"]*)\"$")
	public void selects(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    SelectDropDownByText(dbankdemoSignUpHere.title, title);
	}
	
	@When("^Click on Sign up here$")
	public void click_on_Sign_up_here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Clicks(dbankdemoSignUpHere.signUpHereLink);
	}

	@When("^enter the First name \"([^\"]*)\"$")
	public void enter_the_First_name(String fname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    EnterText(dbankdemoSignUpHere.fname, fname);
	}

	@When("^enter the Last name \"([^\"]*)\"$")
	public void enter_the_Last_name(String lname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.lname, lname);
	}

	@When("^enter the gender \"([^\"]*)\"$")
	public void enter_the_gender(String gender) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if(gender.equalsIgnoreCase("female"))
	    {
			Clicks(dbankdemoSignUpHere.female);
	    }
	    else
	    {
			Clicks(dbankdemoSignUpHere.male);

	    }
	}

	@When("^enter DOB \"([^\"]*)\"$")
	public void enter_DOB(String dob) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.dob, dob);
	}

	@When("^Enter SSN \"([^\"]*)\"$")
	public void enter_SSN(String ssn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.ssn, ssn);
	}

	@When("^Enter Email address \"([^\"]*)\"$")
	public void enter_Email_address(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.emailAddress, email);
	}

	@When("^Enter Password \"([^\"]*)\"$")
	public void enter_Password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.password, password);
	}

	@When("^Enter confirm password \"([^\"]*)\"$")
	public void enter_confirm_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EnterText(dbankdemoSignUpHere.confirmPassword, password);
	}
	
	@When("^User clicks on Next Button$")
	public void user_clicks_on_Next_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Clicks(dbankdemoSignUpHere.nextButton);
	}

	@Then("^Verify the title Page$")
	public void verify_the_title_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    AssertionsAndVerifications.assertEqual(PropertiesHelper.driver.getTitle(), "Digital Bank","","");
	}
}

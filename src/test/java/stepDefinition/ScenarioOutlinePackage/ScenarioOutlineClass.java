package stepDefinition.ScenarioOutlinePackage;

import java.util.List;

import DevLabsPages.DevLabsPageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import helper.Operations;

public class ScenarioOutlineClass extends Operations {
	
	DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
	@When("^User clicks on Prompt button$")
	public void user_clicks_on_Prompt_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Clicks(devLabsPageObjects.promptButton);
	}

	@When("^User enters the \"([^\"]*)\" in the alert's input box$")
	public void user_enters_the_in_the_alert_s_input_box(String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		switchToAlertWriteText(value);
	}
	
	@When("^User enters the in the alert's input box$")
	public void user_enters_the_in_the_alert_s_input_box(DataTable value) throws Throwable {
		//List<String> list = value
	}

}

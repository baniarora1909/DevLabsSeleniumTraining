package DevLabsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.PropertiesHelper;

public class DbankdemoSignUpHere {
	public DbankdemoSignUpHere() {
		PageFactory.initElements(PropertiesHelper.driver, this);
	}
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sign")
	public WebElement signUpHereLink;
	
	@FindBy(how = How.ID, using = "title")
	public WebElement title;
	
	@FindBy(how = How.ID, using = "firstName")
	public WebElement fname;
	
	@FindBy(how = How.ID, using = "lastName")
	public WebElement lname;
	
	@FindBy(how = How.XPATH, using = "//INPUT[@value='M']")
	public WebElement male;

	@FindBy(how = How.XPATH, using = "//INPUT[@value='F']")
	public WebElement female;
	
	@FindBy(how = How.ID, using = "dob")
	public WebElement dob;
	
	@FindBy(how = How.ID, using = "ssn")
	public WebElement ssn;
	
	@FindBy(how = How.ID, using = "emailAddress")
	public WebElement emailAddress;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using = "//BUTTON[text()='Next']")
	public WebElement nextButton;
}

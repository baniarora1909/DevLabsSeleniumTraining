package DevLabsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.PropertiesHelper;

public class DbankdemoPages {
	public DbankdemoPages() {
		PageFactory.initElements(PropertiesHelper.driver, this);
	}
	
	@FindBy(how = How.ID, using = "username")
	public WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "remember-me")
	public WebElement rememberMe;
	
	@FindBy(how = How.ID, using = "submit")
	public WebElement signInButton;
	
}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSetup;

public class LandingPage extends BaseSetup {

	@FindBy(xpath = "//input[@name='username']") WebElement userNameField;
	@FindBy(xpath = "//input[@name='password']") WebElement passwordField;
	@FindBy(xpath = "//input[@type='submit'][@value='Log In']") WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Forgot login info?']") WebElement forgotLoginLink;
	@FindBy(xpath = "//a[text()='Register']") WebElement registerLink;
	
	@FindBy(xpath = "//a[text()='Log Out']") WebElement logOutLink;

	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateUsernameField()
	{
		return userNameField.isEnabled();
	}
	
	public boolean validatePasswordField()
	{
		return passwordField.isEnabled();
	}
	
	public boolean validateLoginButton()
	{
		return loginButton.isEnabled();
	}
	
	public void enterUsername()
	{
		userNameField.sendKeys(prop.getProperty("userID"));
	}
	
	public void enterPassword()
	{
		passwordField.sendKeys(prop.getProperty("pwd"));
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	public boolean validateLogoutLink()
	{
		return logOutLink.isDisplayed();
	}
}

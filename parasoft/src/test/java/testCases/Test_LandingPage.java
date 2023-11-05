package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseSetup;
import pageObjects.LandingPage;

public class Test_LandingPage extends BaseSetup {

	boolean checkElement;
	SoftAssert softAssert = new SoftAssert();
	
	LandingPage landing;
	
	public Test_LandingPage()
	{
		super();
	}
	
	@BeforeTest
	public void setup()
	{
		initialization();
		landing = new LandingPage();
	}
	
	public void test_validateUsernameField()
	{
		checkElement = landing.validateUsernameField();
		softAssert.assertTrue(checkElement, "Username field found disabled");
	}
	
	@Test(priority = 1)
	public void validatePasswordField()
	{
		checkElement = landing.validatePasswordField();
		softAssert.assertTrue(checkElement, "Password field found disabled");
	}
	
	@Test(priority = 2)
	public void	validateLoginButton()
	{
		checkElement = landing.validateLoginButton();
		softAssert.assertTrue(checkElement, "Login button found disabled");
	}
	
	@Test(priority = 3)
	public void enterUsername()
	{
		landing.enterUsername();
	}
	
	@Test(priority = 4)
	public void enterPassword()
	{
		landing.enterPassword();
	}
	
	@Test(priority = 5)
	public void clickloginButton()
	{
		landing.clickloginButton();
	}
	
	//comment
	@Test(priority = 6)
	public void validateLogoutLink()
	{
		checkElement = landing.validateLogoutLink();
		softAssert.assertTrue(checkElement, "Logout button found disabled");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		softAssert.assertAll();
	}
}

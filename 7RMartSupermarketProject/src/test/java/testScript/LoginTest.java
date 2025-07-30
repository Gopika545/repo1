package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
@Test(retryAnalyzer = retry.Retry.class,priority =1,description="verify user login with valid credential")
	public void verifyUserLoginwithValidcredential() throws IOException
	
	{
	HomePage homepage;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password);
		homepage =loginpage.signinbutton();
		boolean dashboarddisplayed = loginpage.isDashboardTitleDisplayed();
		Assert.assertTrue(dashboarddisplayed, "Messages.VALIDCRENDIALMSGERROR");
				
	}
				
	@Test(retryAnalyzer = retry.Retry.class,priority =2,description="verifying user login with invalid password")
	public void verifyUserLoginwithInvalidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(1, 0, "LoginPage");
		String password = ExcelUtility.getstring(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password).signinbutton();
		String expected ="7rmart supermarket";
		String actual = loginpage.getTextFromtitle();
		Assert.assertEquals(actual, expected,"Messages.INVALIDPASSWORDERRORMSG");
	}
	@Test(retryAnalyzer = retry.Retry.class,priority =3,description="verify user login with InvalidUserLoginwithValidPassword")
	public void verifyInvalidUserLoginwithValidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(2, 0, "LoginPage");
		String password = ExcelUtility.getstring(2, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password).signinbutton();
		boolean alertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "Messages.VALIDPASSWORDERRORMSG");
	
	
	}
	@Test(retryAnalyzer = retry.Retry.class,priority =4,description="verify user login with InvalidUserLoginwithInvalidPassword",dataProvider="LOGINPROVIDER")
	public void verifyInvalidUserLoginwithInvalidPassword(String username, String password) throws IOException
	{
		//String username = ExcelUtility.getstring(3, 0, "LoginPage");
		//String password = ExcelUtility.getstring(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password).signinbutton();
		boolean alertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertdisplayed, "Messages.INVALIDCRENDTIALERRORMSG=");
	}
	public Object[][] getDataFromDataProvider() throws IOException
	{
	return new Object[][] { new Object[] {"admin","admin22"},
	new Object[] {"admin123","123"},
	//new Object[] {ExcelUtility.getStringData(3, 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
	};
	}
	}
	



package automationCore;

import java.io.IOException;

import org.testng.annotations.Test;

import PagesNew.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseNew {
	@Test(priority=1,description="login with valid password", retryAnalyzer = retry.Retry.class)
	public void verifyUserLoginwithValidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();
				
	}
				
	@Test(priority=2,description="login with Invalid password", retryAnalyzer = retry.Retry.class)
	public void verifyUserLoginwithInvalidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(1, 0, "LoginPage");
		String password = ExcelUtility.getstring(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();
	}
	@Test(priority=3,description="Invalidlogin with valid password", retryAnalyzer = retry.Retry.class)
	public void verifyInvalidUserLoginwithValidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(2, 0, "LoginPage");
		String password = ExcelUtility.getstring(2, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();	
	}
	@Test(priority=4,description="Invalidlogin with Invalid password", retryAnalyzer = retry.Retry.class)
	public void verifyInvalidUserLoginwithInvalidPassword() throws IOException
	{
		String username = ExcelUtility.getstring(3, 0, "LoginPage");
		String password = ExcelUtility.getstring(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();	
	}
	}
	


	



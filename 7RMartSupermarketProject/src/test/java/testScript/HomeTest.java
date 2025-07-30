package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;


public class HomeTest extends Base {
	@Test(description="verify user can logout")
	
	public void  verifyhomePageclickOnLogout() throws IOException
	{
		HomePage homepage;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.signinbutton();
		
	
	
	

	homepage.clickOnadmindropdownLink();
	
	loginpage=homepage.homePageclickOnLogout();
	String actual = homepage.signInPageDisplayed();
	String expected = "Sign In";
	Assert.assertEquals(actual, expected, "Messages.SIGININERRORMSG");
	}

}

package automationCore;

import java.io.IOException;

import org.testng.annotations.Test;

import PagesNew.HomePage;
import PagesNew.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends BaseNew {
	
	
	
	public void  verifyhomePageclickOnLogout() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();
	
	HomePage homepage = new HomePage( driver);
	
	homepage.homePageclickOnLogout();
	}
}



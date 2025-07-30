package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utility.ExcelUtility;

public class ManageCategoryTest extends Base {
	
	@Test(description="verify That The User Is Able To Search New Category")
	public void verifyThatTheUserIsAbleToSearchNewCategory() throws IOException
	{
		HomePage homepage;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.signinbutton();
		ManageCategoryPage managecatpage;
		
		managecatpage= homepage.clickOnManageCatmoreinfo();
		managecatpage.clickOnSearchbutton().enterCategoryOnSearchfield(username);
		
	}

}


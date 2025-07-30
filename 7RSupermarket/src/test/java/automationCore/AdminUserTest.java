package automationCore;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesNew.AdminUserPage;
import utilities.ExcelUtility;

public class AdminUserTest extends BaseNew{
	@Test
	public void verifyClickOnadminUser() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		AdminUserPage adminuser =new AdminUserPage(driver);
		adminuser.enterUsernameonUsernameField(username);
		adminuser.enterPasswordonPasswordField(password);
		adminuser.signinbutton();
		adminuser.clickOnAdminUserButton();
		adminuser.clickAddUserButton();
		adminuser.addnewAdminUserName();
		adminuser.enterpasswordonpasswordfield();
		adminuser.clickOnUserType();
		boolean saveduserAlert  = adminuser.saveduserAlert();
		Assert.assertTrue(saveduserAlert, " adminuser detail  not created");
		
		
	
		
	}
	@Test
	public void verifysearchOnAdminUser() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		AdminUserPage adminuser =new AdminUserPage(driver);
		adminuser.enterUsernameonUsernameField(username);
		adminuser.enterPasswordonPasswordField(password);
		adminuser.signinbutton();
		adminuser.clickOnAdminUserButton();
		adminuser.clickOnSearchButton();
		adminuser.clickOnSearchUserType();
		adminuser.clickOnSearchadminButton();
		adminuser.searchOnSearchButtonField();
		String  searchAdminUserAlert  = adminuser.searchAdminUserAlert();
		Assert.assertEquals( searchAdminUserAlert, "fail to search");
	}

}

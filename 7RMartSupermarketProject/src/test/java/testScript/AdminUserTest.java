package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;
import utility.FakerUtility;

public class AdminUserTest extends Base {
	
	@Test
	public void verifyThatTheUserIsAbleToAddNewAdminuer() throws IOException {
		HomePage homepage = null;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();
		
		AdminUserPage adminuserpage;
		adminuserpage= homepage.clickOnAdminUserInfo();
		adminuserpage.clickOnNewButtonToAddNewAdminUser();
		FakerUtility fakerutility =new FakerUtility();
		
		fakerutility.createRandomUserName();
		String userName2 = fakerutility.createRandomUserName();
		String password1 = fakerutility.createRandomPassword();
		adminuserpage.enterTheAdminUserNameInTheUserNameField( userName2).enterTheAdminPasswordInPasswordField(password1).selectTheAdminUserTypeFromTheDropDownList().saveTheDetailsEnteredOfNewUser();
		boolean isAdminUsersDisplayed = adminuserpage.alertUserCreatedSuccessfullyDisplayed();
		Assert.assertTrue(isAdminUsersDisplayed, "Message.USERADDERRORMSG");

		
		
	}

	@Test
	public void verifyThatTheUserIsAbleToSearchAndFindTheNewlyAddedUser() throws IOException {
		
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.signinbutton();
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.clickTheSearchButtonOnAdminUsersPage();
		adminuserpage.enterTheUsernameTobeSearchedInTheUsernameField().selectTheUserTypeToBeSearchedFromTheUserTypeDropDown().clickOnSearchButton();
		String actual = adminuserpage.manageUserSearchPageDisplayed();
		String expected = "Gopika21";
		Assert.assertEquals(actual, expected, "Messages.USERSEARCHNEWADMINUSERERRORMSG ");
		

		

	}

}



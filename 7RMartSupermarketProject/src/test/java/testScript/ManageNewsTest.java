package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(description="verify That User is Able To Add New News In The Application")
	public void verifyThatUserIsAbleToAddNewNewsInTheApplication() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.signinbutton();
		

		ManageNewsPage managenewspage;
		managenewspage=homepage.clickonManageNewsButton();
		managenewspage.clickonNewButtonToAddNewNews().enterTheNewsInTheTextFieldDisplayed().clickOnSaveButtonToSaveTheNewNewsAdded();
		
		boolean isManageNewsDisplayed = managenewspage.alertNewsCreatedSuccessfullyDisplayed();
		Assert.assertTrue(isManageNewsDisplayed, "Messages. USERADDNEWNEWSERRORMSG");
		

	}

	@Test(description="verify That User Is Able To Search the Added News")
	public void verifyThatUserIsAbleToSearchAndFindTheAddedNews() throws IOException 
	{
		HomePage homepage;
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.signinbutton();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		homepage.clickonManageNewsButton();
		managenewspage.clickOnSearchButton().enterTheNewsToBeSearchedInTheTextFieldProvided().clickOnSearchSubmitButton();
		
		

		
		
		String actual = managenewspage.manageNewsSearchPageDisplayed();
		String expected = "Kerala gods own country";
		Assert.assertEquals(actual, expected, "Message.USERSEARCHNEWSERRORMSG");

	}


}

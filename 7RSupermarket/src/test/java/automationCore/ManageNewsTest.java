package automationCore;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesNew.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest  extends BaseNew{
	@Test
	public void  verifyUserCanAddNewNews() throws IOException 
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.enterUsernameonUsernameField(username);
		managenewspage.enterPasswordonPasswordField(password);
		managenewspage.signinbutton();
		managenewspage.userClickOnManagerNews();
		managenewspage. clickOnNewButton();
		managenewspage.addNewNewsOnNewsfield();
		boolean savednewsAlert  = managenewspage.savednewsAlert();
		Assert.assertTrue(savednewsAlert, "Alert not displayed - News may not have been created");
		
	}
	
	
	

	
	@Test
	public void verifyUserAbleToSearchOnSearchfield() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
	ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.enterUsernameonUsernameField(username);
		managenewspage.enterPasswordonPasswordField(password);
		managenewspage.signinbutton();
		managenewspage.addNewNewsOnNewsfield();
		managenewspage.enterSearchOnSearchButton();
		boolean searchnewsAssert  = managenewspage.savednewsAlert();
		Assert.assertTrue(searchnewsAssert, "Search Unsuccesful");
		
	}
	
	}
	
		
		
	

		
		
		
	
	





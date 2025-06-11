package automationCore;

import java.io.IOException;

import org.testng.annotations.Test;

import PagesNew.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends BaseNew {
	@Test
	public void verifyUsercreateNewCategory() throws IOException
	{
		String username = ExcelUtility.getstring(0, 0, "LoginPage");
		String password = ExcelUtility.getstring(0, 1, "LoginPage");
		ManageCategoryPage managecategorypage =new ManageCategoryPage(driver);
		managecategorypage.enterUsernameonUsernameField(username);
		managecategorypage.enterPasswordonPasswordField(password);
		managecategorypage.signinbutton();
		managecategorypage. clickOnManageCategoryButton();
		managecategorypage.ClickOnNewButton();
		managecategorypage.ClickOnSaveButton();
		managecategorypage.enterCategoryField("Category");
	}
	
		
	@Test
		public void verifyenterOnSearchButton() throws IOException
		{
			String username = ExcelUtility.getstring(0, 0, "LoginPage");
			String password = ExcelUtility.getstring(0, 1, "LoginPage");
		ManageCategoryPage managecategorypage =new ManageCategoryPage(driver);
			managecategorypage.enterUsernameonUsernameField(username);
			managecategorypage.enterPasswordonPasswordField(password);
			managecategorypage.signinbutton();
			managecategorypage. clickOnManageCategoryButton();
			managecategorypage.ClickOnNewButton();
			managecategorypage.enterCategoryField("Category");
			managecategorypage.enterSearchButton("Category");
			
			

}}

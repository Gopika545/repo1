package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	@FindBy(xpath="//a[@data-toggle=\"dropdown\" ]") private WebElement adminDropDownLink;
	
	@FindBy(xpath = "/html/body/div/nav/ul[2]/li/div/a[2]")private WebElement clickonlogout;
	@FindBy(css="a.small-box-footer")private WebElement adminUserinfo;
	@FindBy(xpath="//p[text()='Manage News']")private WebElement ManageNewsButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")private WebElement managecategorymoreinfo;
	
	public HomePage clickOnadmindropdownLink()
	{
		adminDropDownLink.click();
		return this;
	}
	
	public LoginPage homePageclickOnLogout()
	{
		clickonlogout.click();
		return new LoginPage(driver);
	}
	public String signInPageDisplayed() {
		return signinButton.getText();
}
	public AdminUserPage clickOnAdminUserInfo()
	{
		adminUserinfo.click();
		return new AdminUserPage(driver);
	}
	public ManageNewsPage clickonManageNewsButton()
	{
		ManageNewsButton.click();
		return new ManageNewsPage(driver);
		
	}
	public ManageCategoryPage clickOnManageCatmoreinfo()
	{
		managecategorymoreinfo.click();
		return new ManageCategoryPage(driver);
	}


}
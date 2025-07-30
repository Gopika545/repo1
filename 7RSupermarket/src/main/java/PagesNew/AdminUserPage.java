package PagesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement adminUserinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement clickAddUser;	
	@FindBy(xpath="//[@id='username']")private WebElement username; 
	@FindBy(xpath="//[@id='user_type']")private WebElement usertype;
	@FindBy(xpath="//[@id='password']")private WebElement password ;
	@FindBy(xpath="//button[@name='Create']")private WebElement saveButton;
	@FindBy(xpath="//a[@onclick='click_button(2)']")private WebElement searchadminButton;
	@FindBy(id="un")private WebElement searchButtonfield ;
	@FindBy(id="ut")private WebElement  searchusertype;
	@FindBy(name="Search")private WebElement searchbutton;
	@FindBy(name="btn btn-default btn-fix")private WebElement resetButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[1]")private WebElement adminUserAlert;
	@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/thead/tr/th[1]")private WebElement searchadminAssert;
	public void enterUsernameonUsernameField(String username)
	{
		usernamefield.sendKeys(username);
		
	}
	public void enterPasswordonPasswordField(String password )
	{
		passwordfield.sendKeys(password);
	}
	public void signinbutton()
	{
		signinButton.click();
	}
public void clickOnAdminUserinfo()
{
	adminUserinfo.click();
}
public void  clickAddUserButton()
{
	clickAddUser.click();
}
public void addnewAdminUserName()
{
	username.sendKeys("ikshit");
	
}
public void clickOnUserType()
{
	Select select = new Select(usertype);
			select.selectByValue("staff");
}
public void enterpasswordonpasswordfield()
{
	password.sendKeys("password");
} 
public void clickOnSearchadminButton()
{
	searchadminButton.click();
}
public void searchOnSearchButtonField()
{
	searchButtonfield.sendKeys("ikshit");
}
public void clickOnSearchUserType()
{
	searchusertype.click();
	
}
public void clickOnSearchButton()
{
	searchbutton.click();
	resetButton.click();
}
public boolean saveduserAlert()

{
	return adminUserAlert.isDisplayed();
}



public String searchAdminUserAlert()
{
	return(searchadminAssert.getText());
}
}










































































	


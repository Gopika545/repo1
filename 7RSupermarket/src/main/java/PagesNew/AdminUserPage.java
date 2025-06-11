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
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")private WebElement adminUserButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newButton;	
	@FindBy(xpath="//*[@id=\"username\"]")private WebElement username; 
	@FindBy(xpath="//*[@id=\"user_type\"]")private WebElement usertype;
	@FindBy(xpath="//*[@id=\"password\"]")private WebElement password ;
	@FindBy(xpath="//*[@id=\"adddiv\"]/div/div/div/form/div[2]/button")private WebElement saveButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement searchadminButton;
	@FindBy(xpath="//*[@id=\"un\"]")private WebElement searchButtonfield ;
	@FindBy(xpath="//*[@id=\"ut\"]")private WebElement  searchusertype;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[3]/button")private WebElement searchbutton;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[3]/a")private WebElement resetButton;
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
public void adminuserOnClick()
{
	adminUserButton.click();
}
public void  clickOnNewAdminUserButton()
{
	newButton.click();
}
public void addnewAdminUserName()
{
	username.sendKeys("Gopika");
	
}
public void clickOnUserType()
{
	Select select = new Select(usertype);
			select.selectByValue("admin");
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
	searchButtonfield.sendKeys("Gopika");
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











































{
	newButton.click();
}

}
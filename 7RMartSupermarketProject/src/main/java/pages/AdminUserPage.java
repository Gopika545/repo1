package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constant.Constants;
import utility.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")private WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")private WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']")private WebElement usertypedropdown;
	@FindBy(xpath = "//button[@name='Create']")private WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")private WebElement usercreatedsuccessfullyalert;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")private WebElement adminuserssearchbutton;
	@FindBy(xpath = "//input[@id='un']")private WebElement searchusernamefield;
	@FindBy(xpath = "//select[@id='ut']")private WebElement searchusertypedropdown;
	@FindBy(xpath = "//button[@name='Search']")private WebElement searchbutton;
	@FindBy(xpath = "//td[text()='Gopika21']")private WebElement searchmanageadminuserresult;
	
	
	
	

	

	public AdminUserPage clickOnNewButtonToAddNewAdminUser() {
		newbutton.click();
		return this;
	
	}

	public AdminUserPage enterTheAdminUserNameInTheUserNameField(String userName2) {
		usernamefield.sendKeys(userName2);
		return this;
		
	}

	public  AdminUserPage enterTheAdminPasswordInPasswordField(String password1) {
		passwordfield.sendKeys(password1);
		return this;
		
	}

	public AdminUserPage selectTheAdminUserTypeFromTheDropDownList() {
		
	PageUtility page = new PageUtility();
	page.selectDropdownWithVisibleText(usertypedropdown, Constants.USERTYPE);
	return this;

		//Select select = new Select(usertypedropdown);
		//select.selectByVisibleText("Staff");
	}

	public  AdminUserPage  saveTheDetailsEnteredOfNewUser() {
		
		savebutton.click();
		return this;
		
	}
	public boolean alertUserCreatedSuccessfullyDisplayed() {
		return usercreatedsuccessfullyalert.isDisplayed();
	}
	public AdminUserPage clickTheSearchButtonOnAdminUsersPage() {
		adminuserssearchbutton.click();
		return this;

	}

	public AdminUserPage enterTheUsernameTobeSearchedInTheUsernameField() {
		searchusernamefield.sendKeys();
		return this;
		
	}

	public AdminUserPage selectTheUserTypeToBeSearchedFromTheUserTypeDropDown() {
		PageUtility page = new PageUtility();
		page.selectDropdownWithVisibleText(searchusertypedropdown, Constants.USERTYPE);
		return this;
		
		
 //Select select = new Select(searchusertypedropdown);
	//select.selectByVisibleText("Staff");
		
	}

	public AdminUserPage clickOnSearchButton() {
		searchbutton.click();
		return this;
	
	}
	public String manageUserSearchPageDisplayed() {
		return searchmanageadminuserresult.getText();
	}

	
	}


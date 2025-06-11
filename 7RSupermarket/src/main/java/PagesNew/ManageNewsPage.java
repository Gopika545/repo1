package PagesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/a")private WebElement clickManageNews;
	@FindBy(xpath="\"//textarea[@id=\\\"news\\\"]")private WebElement newButton;	
	@FindBy(xpath="//*[@id=\"news\"]")private WebElement newsfield;	
	@FindBy(xpath="//*[@id=\"form\"]/div/div[2]/button")private WebElement saveButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement searchButton;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[1]/input")private WebElement searchfield;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/button")private WebElement searchBoxButton;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/a")private WebElement resetButton;
	@FindBy(className="alert alert-success")private WebElement newsAlert;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr/td[1]")private WebElement searchfieldAssert;
	
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
	public void userClickOnManagerNews()
	{
		clickManageNews.click();

	}
	public void clickOnNewButton()
	{
	newButton.click();	
	}
	public void addNewNewsOnNewsfield()
	{
		newsfield.sendKeys("Kerala god own country");
		saveButton.click();
	}
	public void enterSearchOnSearchButton()
	{
		searchButton.click();
	}
	public void enterSearchOnSearchfield(String news)
	
	{
		searchfield.sendKeys("Kerala god own country");
		searchBoxButton.click();
		resetButton.click();
	}
	public boolean savednewsAlert()
	
	{
		return newsAlert.isDisplayed();
	}
	public boolean searchnewsAssert()
	{
		return searchnewsAssert();
	}
	
}

	
	
	
	



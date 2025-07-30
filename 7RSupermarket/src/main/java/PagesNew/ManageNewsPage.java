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
	@FindBy(xpath="//p[text()='Manage News']")private WebElement ManageNewsButton;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newButton;	
	@FindBy(xpath="//textarea[@name='news']")private WebElement newsfield;	
	@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchButton;
	@FindBy(xpath="//input[@type='text']")private WebElement searchfield;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")private WebElement searchBoxButton;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")private WebElement resetButton;
	@FindBy(css="alert alert-success")private WebElement newsAlert;
	@FindBy(xpath="//*[text()='Kerala gods own country']")private WebElement searchfieldAssert;
	
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
	public void clickOnManagerNews()
	{
		ManageNewsButton.click();

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
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	public void SearchOnSearchfield()
	
	{
		searchfield.sendKeys("Kerala god own country");
	}
	public void clickOnSearachbutton()
	{
		searchBoxButton.click();
		//resetButton.click();
	}
	public boolean savednewsAlert()
	
	{
		return newsAlert.isDisplayed();
	}
	public boolean searchnewsAssert()
	{
		return searchfieldAssert.isDisplayed();
	}
	
}

	
	
	
	



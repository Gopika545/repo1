package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//b[text()='7rmart supermarket']") private WebElement pageTitle;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alertdisplayed;
	

	
	
	
	
	
	public LoginPage enterUsernameonUsernameField(String username)
	{
		usernamefield.sendKeys(username);
		return this;
	}
	public LoginPage enterPasswordonPasswordField(String password )
	{
		passwordfield.sendKeys(password);
		return this;
	}
	public HomePage signinbutton()
	{
		signinButton.click();
		return new HomePage(driver);
		
	}
	public boolean isDashboardTitleDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public String getTextFromtitle()
	
	{
		return pageTitle.getText();
		
	}
	public boolean isAlertDisplayed()
	{
		return alertdisplayed.isDisplayed();
	}
		

}

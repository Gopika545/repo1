package PagesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement dashboard;
	
	
	
	
	
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
	public String dashboardDisplayed()
	{
		return dashboard.getText();
		

	}}

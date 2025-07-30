package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryPage {
	
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath= "//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinButton;
	@FindBy(xpath="//a[@onclick='click_button(2)']")private WebElement searchbutton;
	@FindBy(xpath="//input[@name='un']")private WebElement searchcatfield;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchButton;
	
	
	
 
	


public ManageCategoryPage clickOnSearchbutton()
{
	searchbutton.click();
	return this;
}
public ManageCategoryPage enterCategoryOnSearchfield(String name)
{
	searchcatfield.sendKeys(name);
	return this;
	
}
public ManageCategoryPage clickOnSearchButton()
{
	searchButton.click();
	return this;
}





}
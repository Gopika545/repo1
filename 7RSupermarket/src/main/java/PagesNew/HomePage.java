package PagesNew;

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
	
	
	public void clickOnadmindropdownLink()
	{
		adminDropDownLink.click();
	}
	
	public void homePageclickOnLogout()
	{
		clickonlogout.click();
	}
}

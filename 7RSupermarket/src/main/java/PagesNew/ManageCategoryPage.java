package PagesNew;

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
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/div[1]/p") private WebElement clickmanagebutton;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/a")private WebElement manageCategoryButton ;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newButton;
	@FindBy(xpath="//*[@id=\"category\"]")private WebElement categoryfield ;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[5]/button")private WebElement saveButton ;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement searchButton  ;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[1]/input")private WebElement searchButtonField ;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/button")private WebElement searchbutton  ;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/a")private WebElement resetButton  ;
	
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
		public void clickOnManageCategoryButton()
		{
		manageCategoryButton.click();	
		}
		public void ClickOnNewButton()
		{
			newButton.click();
		}
		public void ClickOnSaveButton()
		{
			saveButton.click();
		}
		public void enterCategoryField(String Category)
		{
			categoryfield.sendKeys(Category);
		}
		public void enterSearchButton(String Category)
		{
			searchButton.click();
			searchButtonField.sendKeys(Category);
			searchbutton.click();
			resetButton.click();
		}
	

}

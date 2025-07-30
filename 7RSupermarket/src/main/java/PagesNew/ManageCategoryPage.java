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
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']") private WebElement clickmanageinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement manageCategoryNewButton;
	@FindBy(id="category")private WebElement categoryfield ;
	@FindBy(xpath="//button[type='submit']")private WebElement saveButton ;
	@FindBy(xpath="//a[@onclick='click_button(2)']")private WebElement searchButton  ;
	@FindBy(xpath="//input[@placeholder='Category']")private WebElement searchButtonField ;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchbutton  ;
	@FindBy(xpath="//a[@type='button']")private WebElement resetButton  ;
	
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
		public void clickOnManageCategoryinfo()
		{
			
		clickmanageinfo.click();	
		}
		public void ClickOnAddButton()
		{
			manageCategoryNewButton.click();
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

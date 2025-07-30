package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constants;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")private WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")private WebElement enterthenewstextfield;
	@FindBy(xpath = "//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")private WebElement newscreatedsuccessfullyalert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")private WebElement searchbutton;
	@FindBy(xpath = "//input[@class='form-control']")private WebElement searchtextfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")private WebElement searchsubmitbutton;
	@FindBy(xpath = "//td[text()='Kerala gods own country']")private WebElement searchresult;
	
	
	
	

	public ManageNewsPage clickonNewButtonToAddNewNews() {
		newbutton.click();
		return this;
	
	}

	public ManageNewsPage enterTheNewsInTheTextFieldDisplayed(){
		enterthenewstextfield.sendKeys(Constants.NEWSTOADD);
		return this;
		
	}

	public ManageNewsPage clickOnSaveButtonToSaveTheNewNewsAdded() {
		savebutton.click();
		return this;

	}


	public boolean alertNewsCreatedSuccessfullyDisplayed() {
		return newscreatedsuccessfullyalert.isDisplayed();
	}

	public ManageNewsPage clickOnSearchButton() {
		searchbutton.click();
		return this;
		
	}

	public ManageNewsPage enterTheNewsToBeSearchedInTheTextFieldProvided() {
		searchtextfield.sendKeys(Constants.NEWSTOADD);
		return this;
	
	}

	public ManageNewsPage clickOnSearchSubmitButton() {
		searchsubmitbutton.click();
		return this;

	}

	
	public String manageNewsSearchPageDisplayed() {
		return searchresult.getText();
	}

}

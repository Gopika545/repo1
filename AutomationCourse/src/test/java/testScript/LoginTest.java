package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBasics.BaseTestNG;
import utilities.ExcelUtility;

public class LoginTest extends BaseTestNG{
@Test
public void verifyUserLoginwithValidCredentials() throws IOException {
	WebElement usernamefield = driver.findElement(By.id("user-name"));
	usernamefield.sendKeys("standard_user");
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("secret_sauce");
	WebElement loginbutton = driver.findElement(By.id("login-button"));
	loginbutton.click();
	String username = ExcelUtility.getstring(0, 0, "LoginPage");
	String password = ExcelUtility.getstring(0, 1, "LoginPage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
	
	
	
}
@Test
public void verifywithInvalidUserLoginValidPassword() throws IOException
{
	//WebElement usernamefield = driver.findElement(By.id("user-name"));
	//usernamefield.sendKeys("standarduser");
	//WebElement passwordfield = driver.findElement(By.id("password"));
	//password.sendKeys("secret_sauce");
	//WebElement loginbutton = driver.findElement(By.id("login-button"));
    //loginbutton.click();
    String username = ExcelUtility.getstring(1,0, "LoginPage");
	String password = ExcelUtility.getstring(1,1, "LoginPage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
    
	
	
	}
@Test
public void verifywithValidUserLoginInvalidPassword() throws IOException
	{
	//WebElement usernamefield = driver.findElement(By.id("user-name"));
	//usernamefield.sendKeys("standard_user");
	//WebElement password = driver.findElement(By.id("password"));
	//password.sendKeys("secretsauce");
	//WebElement loginbutton = driver.findElement(By.id("login-button"));
	//loginbutton.click();
	String username = ExcelUtility.getstring(2, 0, "LoginPage");
	String password = ExcelUtility.getstring(2,1, "LoginPage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
	
	
}
@Test
public void verifywithInvalidCredentials() throws IOException
{
	//WebElement usernamefield = driver.findElement(By.id("user-name"));
	//usernamefield.sendKeys("standarduser");
	///WebElement password = driver.findElement(By.id("password"));
//	password.sendKeys("secretsauce");
	//WebElement loginbutton = driver.findElement(By.id("login-button"));
	//loginbutton.click();
	String username = ExcelUtility.getstring(3, 0, "LoginPage");
	String password = ExcelUtility.getstring(3,1, "LoginPage");
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
	
}

}

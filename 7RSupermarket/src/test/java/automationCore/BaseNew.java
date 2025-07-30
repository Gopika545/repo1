
package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseNew {
	public WebDriver driver;
	
	
		
	@BeforeMethod
	public void initilisationBrowser()
	{
		driver = new ChromeDriver();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	
	

}
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}
}

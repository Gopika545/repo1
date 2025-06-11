package automationCore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseNew {
	
	
	public WebDriver driver;
	@BeforeMethod

	public void intilisationBrowser() {
		  driver = new ChromeDriver(); 
		  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
		public void browserClose()
		
		{
			driver.quit();
		}
}


;
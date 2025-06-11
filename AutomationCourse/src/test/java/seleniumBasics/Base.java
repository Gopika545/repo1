package seleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base {
public WebDriver driver;
	
	public void intilisationBrowser() {
		  driver = new ChromeDriver(); 
		
		driver.navigate().to("https://selenium.qabible.in");
		driver.manage().window().maximize();
		
	}
		public void browserClose()
		
		{
			driver.quit();
		}
	

	}
	
	
	
	





	   

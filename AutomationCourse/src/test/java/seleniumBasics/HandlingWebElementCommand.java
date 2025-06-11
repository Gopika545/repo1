package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElementCommand extends Base{
	public void verifyWebElementCommand() {
	
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox = driver.findElement(By.xpath("// input[@id=\"single-input-field']"));
	messagebox.sendKeys("Gopika");
	WebElement ShowMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	wait.until(ExpectedConditions.elementToBeClickable(ShowMessageButton));
	
	
	 ShowMessageButton.click();
	 Wait<WebDriver>Fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2))
			 .ignoring(NoSuchElementException.class);
	 Fluent.until(ExpectedConditions.elementToBeClickable(ShowMessageButton));
	 
	 WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
	 System.out.println(yourmessage.getText());
	 messagebox.clear();
	 WebElement valueA = driver.findElement(By.id("value-a"));
	 System.out.println(valueA.getTagName());
	
	}
	public static void main(String[] args) {
		HandlingWebElementCommand webElement = new HandlingWebElementCommand();
		webElement.intilisationBrowser();
		webElement.verifyWebElementCommand();
		
	

	}
	
}



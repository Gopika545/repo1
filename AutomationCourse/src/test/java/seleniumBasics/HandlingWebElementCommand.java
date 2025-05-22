package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommand extends Base{
	public void verifyWebElementCommand() {
	
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox = driver.findElement(By.xpath("// input[@id=\"single-input-field']"));
	messagebox.sendKeys("Gopika");
	WebElement ShowMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	 ShowMessageButton.click();
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
		
		
		// TODO Auto-generated method stub

	}
	
}



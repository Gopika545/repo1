package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	public void verifySimpleAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("gopika");
		alert.accept();
		
	}

	public static void main(String[] args) {
		HandlingAlerts alerts =new HandlingAlerts();
		alerts.intilisationBrowser();
		//alerts.verifySimpleAlerts();
		//alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();
		// TODO Auto-generated method stub

	}

}

package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileuploadsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile"));
		fileupload.sendKeys("C:\\Users\\AKHIL M S\\git\\repo1\\AutomationCourse\\src\\test\\resources\\SAGAR RANI.pdf");
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void verifyfileuploadrobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickfile = driver.findElement(By.id("pickfiles"));
		pickfile.click();
		StringSelection ss = new StringSelection("C:\\Users\\AKHIL M S\\git\\repo1\\AutomationCourse\\src\\test\\resources\\SAGAR RANI.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	

	public static void main(String[] args) {
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.intilisationBrowser();
		//fileupload.verifyFileuploadsendkeys();
		try {
			fileupload.verifyfileuploadrobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}

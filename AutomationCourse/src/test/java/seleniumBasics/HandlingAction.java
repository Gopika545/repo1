package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends Base {
	public void verifyRightClick()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement rightclick = driver.findElement(By.xpath("//a[@Textmethod='Home']"));
		Actions actions = new Actions( driver);
		actions.contextClick(rightclick).build().perform();
	}
	
	
		public void verifyMouseOver()
		{
		WebElement mouseover = driver.findElement(By.id("others"));
		Actions actions = new Actions( driver);
		actions.moveToElement(mouseover).build().perform();
		
		
		
		
	}
		public void verifyDragandDrop()
		{
			driver.navigate().to("https://demoqa.com/droppable");
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			Actions actions = new Actions( driver);
			actions.dragAndDrop(drag,drop).build().perform();
			
		}
		public void keywordAction() throws AWTException
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_T);
		}
		

	public static void main(String[] args) {
		HandlingAction action = new HandlingAction();
		//action.intilisationBrowser();
		//action.verifyRightClick();
		//action.verifyDragandDrop();
		//action.verifyMouseOver();
		try {
			action.keywordAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}

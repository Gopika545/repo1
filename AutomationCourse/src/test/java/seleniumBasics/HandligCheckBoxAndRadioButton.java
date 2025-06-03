package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandligCheckBoxAndRadioButton  extends Base{
	public void verifyCheckBox() {
		driver.navigate().to("\\\"https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html\\\");");
		WebElement checkbox = driver.findElement(By.xpath(" //input[@type='checkbox' and value='option-1']"));
		checkbox.click();
	
		
		
		
		
	
	}
	public void verifyRadioButton() {
		driver.navigate().to("\\\"https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html\\\");");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio' and @value='blue']"));
		radiobutton.click();
		
		
	}

	public static void main(String[] args) {
		HandligCheckBoxAndRadioButton checkboxradiobutton = new HandligCheckBoxAndRadioButton ();
		checkboxradiobutton.intilisationBrowser();
		checkboxradiobutton.verifyCheckBox();
		//checkboxradiobutton.verifyRadioButton();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

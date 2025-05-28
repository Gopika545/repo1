package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base {
	
	public void verifyHandlingTable()
	
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement newtable = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(newtable.getText());
		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
	}
	
	

	public static void main(String[] args) { 
		HandlingTable table = new HandlingTable();
		table.intilisationBrowser();
		table.verifyHandlingTable();
		
		// TODO Auto-generated method stub

	}

}

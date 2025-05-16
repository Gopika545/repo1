package seleniumBasics;

public class HandlingNavigationCommands extends Base {

public void verifyNavigationCommands()
{
driver.navigate().to("https://www.amazon.in/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
		
		
	
}


	public static void main(String[] args) {
	HandlingNavigationCommands navigate =new HandlingNavigationCommands();
	navigate.intilisationBrowser();
	navigate.verifyNavigationCommands();
	navigate.browserClose();
	
	
		// TODO Auto-generated method stub

	}

}

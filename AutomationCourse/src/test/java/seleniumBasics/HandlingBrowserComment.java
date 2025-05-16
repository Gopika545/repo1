package seleniumBasics;

public class HandlingBrowserComment extends Base{
public void verifyBrowserComment()
{
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getWindowHandle());
}

	public static void main(String[] args) {
		HandlingBrowserComment browser =new HandlingBrowserComment();
		browser.intilisationBrowser();
		browser.verifyBrowserComment();
		// TODO Auto-generated method stub

	}

}

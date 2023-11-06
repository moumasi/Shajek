package Shajek_pageAction;

import org.testng.Assert;

import Shajek_pageLocator.Shajek_profilePageLocator;
import Shajek_utility.Shajek_base;
import Shajek_utility.Shajek_utiliti;

public class Shajek_profilePageAction extends Shajek_base{
	
	Shajek_profilePageLocator ShajprofilePageLocator = new Shajek_profilePageLocator();
	
	public void Verifyusercanloginsuccessfully() throws Exception {
		 boolean successlogin = ShajprofilePageLocator.RGprofile.isDisplayed();
		 Assert.assertTrue(successlogin);
		 Thread.sleep(3000);
		 Shajek_utiliti.takeMyScreenshot(driver, "Profile page");
	}

}

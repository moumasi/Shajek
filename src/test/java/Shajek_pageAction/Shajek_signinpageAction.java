package Shajek_pageAction;

import org.testng.Assert;

import Shajek_pageLocator.Shajek_signinpageLocator;
import Shajek_utility.Shajek_base;
import Shajek_utility.Shajek_utiliti;

public class Shajek_signinpageAction extends Shajek_base{
	
	 Shajek_signinpageLocator  ShajsigninpageLocator = new  Shajek_signinpageLocator();

     public void Verifyusercannotsigninsuccessfully() throws Exception {
    	 boolean notsucs = ShajsigninpageLocator.errorsignin.isDisplayed();
    	 Assert.assertTrue(notsucs);
    	 
    	 Thread.sleep(5000);
    	 
    	 Shajek_utiliti.takeMyScreenshot(driver, "signin page");
    	 
	  
       }
     public void Typeusernameandpasswardandclicksignin(String b,String d) throws Exception {
    	 ShajsigninpageLocator.SHuser.sendKeys(b);
    	 ShajsigninpageLocator.SHpassw.sendKeys(d);
    	 ShajsigninpageLocator.SHsignin.click();
    	 Thread.sleep(5000);
     }
  
}

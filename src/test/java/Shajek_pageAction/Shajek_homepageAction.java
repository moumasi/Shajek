package Shajek_pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Shajek_pageLocator.Shajek_homepageLocator;
import Shajek_utility.Shajek_base;
import Shajek_utility.Shajek_testdata;
import Shajek_utility.Shajek_utiliti;

public class Shajek_homepageAction extends Shajek_base{
	
	Shajek_homepageLocator ShajhomepageLocator = new Shajek_homepageLocator();

    public void Thenenterusernameandpasswardandclicksignin(String k, String j) throws Exception {
    	ShajhomepageLocator.signinUser.sendKeys(k);
    	ShajhomepageLocator.signinPassw.sendKeys(j);
    	ShajhomepageLocator.signin.click();
    	Thread.sleep(3000);
	 
      }
    public void Clickonloginlink() {
    	ShajhomepageLocator.loginlink.click();
    }
    public void  mousehovertoRequestanAppoinment() throws Exception {
    	Actions zst = new Actions(driver);
    	zst.moveToElement( ShajhomepageLocator.link).build().perform();
    	Thread.sleep(3000);
    }
    public void ClickonBySpeciality() {
    	ShajhomepageLocator.box.click();
    }
    public void verifyusercancheckedinbutton() throws Exception {
    	boolean Vfscs = ShajhomepageLocator.boxverify.isDisplayed();
    	Assert.assertTrue(Vfscs);
    	Thread.sleep(3000);
    	 Shajek_utiliti.takeMyScreenshot(driver, "cheked mark page");
    }
    
    
    
    public void Acceptallcookies() {
    	ShajhomepageLocator.allcookies.click();
    }
    
    public void Enterdepartandreturndate() {
    	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    	ShajhomepageLocator.departDate.sendKeys(Shajek_testdata.departdate);
    	ShajhomepageLocator.returndate.sendKeys(Shajek_testdata.returndate);
    }

 
 }
 
 
 
 
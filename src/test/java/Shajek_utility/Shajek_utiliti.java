package Shajek_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Shajek_utiliti extends Shajek_base{
	
	public static long pageLoadTimeout = 30;
    public static long implicitlyWait  = 30;
    
    public static void takeMyScreenshot(WebDriver driver,String screenshot) {
    	
    	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	String correntdir = System.getProperty("user.dir");
    	
    	try {
    		FileUtils.copyFile(srcfile, new File(correntdir+"/Shajek_Screenshots/"+screenshot+".png"));
    	} catch (IOException e) {
    		
    		e.printStackTrace();
        }
}

}

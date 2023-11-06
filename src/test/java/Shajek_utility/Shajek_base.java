package Shajek_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class Shajek_base {
	
	public static WebDriver driver;
	public static Properties  ShPro;
	
	public  Shajek_base() {
		
	try {
		FileInputStream confile = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Shajek_config//Sh_config.properties"));
		ShPro = new Properties();
		ShPro.load(confile);
	} catch (FileNotFoundException e) {
		System.out.println("Please look the cod");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("Please look the cod");
		e.printStackTrace();
	}
		
	}
	public void ShBrowser() {
		 String ShAllbrowser = ShPro.getProperty("ShBrowser1");
		 if(ShAllbrowser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("Webdriver.chrome.drive",System.getProperty("user.dir")+("//Shajek//Shajek_ChromeDriver//chromedriver.exe"));
			 ChromeOptions NZ = new ChromeOptions();
			 NZ.addArguments("--remote-allow-origins=*");
			 
			   driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Shajek_utiliti.pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Shajek_utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
		 }
		 else if(ShAllbrowser.equalsIgnoreCase("Edge")) {
			 System.setProperty("Webdriver.edge.drive",System.getProperty("user.dir")+("//Shajek//Shajek_EdgeDriver//msedgedriver.exe"));
			 EdgeOptions NZ = new EdgeOptions();
			 NZ.addArguments("--remote-allow-origins=*");
			 
			   driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Shajek_utiliti.pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Shajek_utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
		 }
	}
    public static void ShLaunchURL(String url) {
    	driver.get(ShPro.getProperty("ShURL4"));
    }
}












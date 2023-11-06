package Shajek_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shajek_utility.Shajek_base;

public class Shajek_signinpageLocator  extends Shajek_base{
	
	public Shajek_signinpageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[@class='error-warning']")
	public WebElement errorsignin;
	
	@FindBy(id = "email")
	public WebElement SHuser;
	
	@FindBy(id = "password")
	public WebElement SHpassw;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	public WebElement SHsignin;
}

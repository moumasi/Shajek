package Shajek_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shajek_utility.Shajek_base;

public class Shajek_homepageLocator extends Shajek_base{
	
	public  Shajek_homepageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="ods-input-0")
	public WebElement signinUser;
	
	@FindBy(id ="ods-input-1")
	public WebElement signinPassw;
	
	@FindBy(id ="noAcctSubmit")
	public WebElement signin;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement loginlink;
    
    @FindBy(linkText = "Request an Appointment")
    public WebElement link;
    
    @FindBy(xpath = "//span[text()='By Specialty']")
    public WebElement box;
    
    @FindBy(xpath = "//span[text()='By Specialty']")
    public WebElement boxverify;
    
    
    
    @FindBy(css = "body > div:nth-child(16) > div.mainContent > div > div.pdynamicbutton > a.call")
    public WebElement allcookies;
    
    @FindBy(id = "jb-date-picker-input-id-2")
    public WebElement departDate;
    
    
    @FindBy(id = "jb-date-picker-input-id-3")
    public WebElement returndate;
    
    
    
    
    
    
    
    
    
}

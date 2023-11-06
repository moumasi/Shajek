package Shajek_pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shajek_utility.Shajek_base;

public class Shajek_profilePageLocator extends Shajek_base{
	
	public Shajek_profilePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='navbar navBack']")
	public WebElement RGprofile;;
	

}

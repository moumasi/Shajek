package Shajek_stepDefination;

import Shajek_pageAction.Shajek_homepageAction;
import Shajek_pageAction.Shajek_profilePageAction;
import Shajek_pageAction.Shajek_signinpageAction;
import Shajek_utility.Shajek_base;
import cucumber.api.java.en.Then;

public class RGPS_login extends Shajek_base{
	
	Shajek_homepageAction ShajhomepageAction = new Shajek_homepageAction();
	Shajek_signinpageAction ShajsigninpageAction = new Shajek_signinpageAction();
	Shajek_profilePageAction ShajprofilePageAction = new Shajek_profilePageAction();
	
	@Then("^Click on login link$")
	public void click_on_login_link() throws Throwable {
		ShajhomepageAction.Clickonloginlink();
	}

	
	@Then("^Type username and passward and click signin$")
	public void type_username_and_passward_and_click_signin() throws Throwable {
		ShajsigninpageAction.Typeusernameandpasswardandclicksignin(ShPro.getProperty("ShUsername2"),ShPro.getProperty("shPassward2"));
		
	}

	@Then("^Verify user can login successfully$")
	public void verify_user_can_login_successfully() throws Throwable {
		ShajprofilePageAction.Verifyusercanloginsuccessfully();
	}



}

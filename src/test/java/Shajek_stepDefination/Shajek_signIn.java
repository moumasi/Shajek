package Shajek_stepDefination;

import Shajek_pageAction.Shajek_homepageAction;
import Shajek_pageAction.Shajek_signinpageAction;
import Shajek_utility.Shajek_base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Shajek_signIn extends Shajek_base {
	
	Shajek_homepageAction ShajhomepageAction = new Shajek_homepageAction();
	Shajek_signinpageAction  ShajsigninpageAction = new  Shajek_signinpageAction();
	
	@Given("^Launch <\"([^\"]*)\"> pro$")
	public void launch_pro(String url) throws Throwable {
		ShLaunchURL(url);
	   
	}

	@Then("^enter username and passward and click signin$")
	public void enter_username_and_passward_and_click_signin() throws Throwable {
		ShajhomepageAction.Thenenterusernameandpasswardandclicksignin( ShPro.getProperty("ShUsername"), ShPro.getProperty("shPassward"));
	   
	}

	@Then("^Verify user cannot signin successfully$")
	public void verify_user_cannot_signin_successfully() throws Throwable {
		ShajsigninpageAction.Verifyusercannotsigninsuccessfully();
	  
	}



}

package Shajek_stepDefination;

import Shajek_pageAction.Shajek_homepageAction;
import Shajek_utility.Shajek_base;
import cucumber.api.java.en.Then;

public class Shajek_checkedbox extends Shajek_base{
	
	Shajek_homepageAction ShajhomepageAction = new Shajek_homepageAction();
	
	@Then("^mouse hover to Request an Appoinment$")
	public void mouse_hover_to_Request_an_Appoinment() throws Throwable {
		ShajhomepageAction.mousehovertoRequestanAppoinment();
	}

	@Then("^Click on By Speciality$")
	public void click_on_By_Speciality() throws Throwable {
		ShajhomepageAction.ClickonBySpeciality();
	}

	@Then("^verify user can checked in button$")
	public void verify_user_can_checked_in_button() throws Throwable {
		ShajhomepageAction.verifyusercancheckedinbutton();
	}



}

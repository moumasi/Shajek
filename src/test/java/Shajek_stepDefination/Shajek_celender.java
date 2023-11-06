package Shajek_stepDefination;

import Shajek_pageAction.Shajek_homepageAction;
import Shajek_utility.Shajek_base;
import cucumber.api.java.en.Then;

public class Shajek_celender extends Shajek_base{
	
	 Shajek_homepageAction  ShajhomepageAction = new  Shajek_homepageAction();
	 
	 @Then("^Accept all cookies$")
	 public void accept_all_cookies() throws Throwable {
		  ShajhomepageAction.Acceptallcookies();
	 }


	
	@Then("^Enter depart and return date$")
	public void enter_depart_and_return_date() throws Throwable {
		ShajhomepageAction.Enterdepartandreturndate();
	}

	@Then("^Verify SHuser can enter departure and return date$")
	public void verify_SHuser_can_enter_departure_and_return_date() throws Throwable {
	   
	}



}

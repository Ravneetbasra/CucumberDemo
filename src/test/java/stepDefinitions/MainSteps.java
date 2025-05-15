package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on Landing Page")
	public void user_is_on_landing_page() {
	    System.out.println("User Landed on NetBanking Page");
	}
	@Given("User is on Practice Landing Page")
	public void user_is_on_practice_landing_page() {
	  System.out.println("User is on Practice Landing page");
	}
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	  
	}
	
	@When("User Login into application")
	public void user_login_into_application() {
		  System.out.println("User Logged into application");
	}
	/*
	@When("User Login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username is "+username+" password is "+password);
	}
	*/
	
	// if we wantour testcase to accept and datatype be it string or integer, go with Regular expression:
	//   (.+) as such used in below example, above example is used for only string
	
	@When("^User Login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username is "+username+" password is "+password);
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		 System.out.println("Home Page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
	
	@Given("setup the enteries in database") 
	public void setupEnteries() 
	{
		System.out.println("************************");
		System.out.println("setup the enteries in database");
	}
	@When("launch the browser from config variables") 
	public void lanchBrowser() 
	{
		
		System.out.println("Browser launch");
	}
	@When("hit the home page url of banking site") 
	public void hitTheUrl() 
	{
	
		System.out.println("Hit The URL");
		System.out.println("************************");
	}
}

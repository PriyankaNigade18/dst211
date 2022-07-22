package stepdef;

import cucumber.api.java.en.*;

public class GoogleInvalidtest {

	@Given("^OPen Google Application$")
	public void open_Google_Application() throws Throwable {

System.out.println("Open Google Application");
	}

	@When("^User enter invalid keyword and go for search$")
	public void user_enter_invalid_keyword_and_go_for_search() throws Throwable {
	    System.out.println("Search invalid keyword");
	}

	@Then("^Application should display some suggesstions for invalid data$")
	public void application_should_display_some_suggesstions_for_invalid_data() throws Throwable {
	    System.out.println("Google search should display some suggessions");
	}


}

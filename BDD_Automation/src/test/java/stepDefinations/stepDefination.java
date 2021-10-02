

package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking index page$")
    public void user_is_on_netbanking_index_page() throws Throwable {
       System.out.println("Inside index page");
    }

    /*@When("^User logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password() throws Throwable {
       System.out.println("login with userName and password");
    }*/
    
    @When("^User logs into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	  System.out.println(strArg1);
    	  System.out.println(strArg2);
    }

    @Then("^index page is displayed$")
    public void index_page_is_displayed() throws Throwable {
        System.out.println("index page is dispayed");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}

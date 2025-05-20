package stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User navigated to login page.");
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        System.out.println("User entered valid credentials.");
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        System.out.println("User is on the homepage.");
    }
}

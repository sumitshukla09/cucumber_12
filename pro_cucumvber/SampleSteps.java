package stepdefinitions;

import io.cucumber.java.en.*;

public class SampleSteps {
    @Given("I have a working Cucumber setup")
    public void i_have_a_working_cucumber_setup() {
        System.out.println("Cucumber setup is working");
    }

    @When("I run the tests")
    public void i_run_the_tests() {
        System.out.println("Running the tests");
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        System.out.println("Test ran successfully");
    }
}

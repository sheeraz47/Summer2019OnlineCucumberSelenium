package com.vytrack.step_definitions;

import io.cucumber.java.en.*;


public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
    }

    @Then("user logs is as store manager")
    public void user_logs_is_as_store_manager() {
        System.out.println("Login as store manager");
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verify page subtitle: "+ string);
    }

}

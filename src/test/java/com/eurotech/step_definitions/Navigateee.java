package com.eurotech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Navigateee {

    @Then("The user should be able to get the text of welcome")
    public void theUserShouldBeAbleToGetTheTextOfWelcome() {
        System.out.println("user able to get the text of welcome");
    }


    @And("The user go to Developers menu")
    public void theUserGoToDevelopersMenu() {
        System.out.println("user go to Developers menu");
    }

    @Then("The user should be able to get the text of Developers")
    public void theUserShouldBeAbleToGetTheTextOfDevelopers() {
        System.out.println("user get the text of Developers");
    }
}

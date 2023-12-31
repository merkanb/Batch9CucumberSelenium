package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDef {

    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        loginPage.loginWithTeacher();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));
//        System.out.println("I verify that I am on  the Dashboard page");
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        loginPage.loginWithStudent();
//        System.out.println("I enter student username and password and click login button");
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer username and password and click login button");
        loginPage.loginWithDeveloper();
    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username,password);
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredentials) throws InterruptedException {
        System.out.println("userCredentials = " + userCredentials);
        String username = userCredentials.get("username");
        String password = userCredentials.get("password");
        loginPage.login(username,password);
//            Thread.sleep(2000);        // to do with internet connection speed // can not locate and process next element
        // it may pass sometimes without this wait, related to the internet connection speed
  // otherwise get selenium.StaleElementReferenceException:stale element reference: stale element not found (synchronization issue ?)

    }


    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedErrorMessage) {
        String actualWarningMessage=loginPage.getWarningMessage(expectedErrorMessage);
        System.out.println("actualWarningMessage = " + actualWarningMessage);
        Assert.assertEquals(expectedErrorMessage, actualWarningMessage);
    }
}

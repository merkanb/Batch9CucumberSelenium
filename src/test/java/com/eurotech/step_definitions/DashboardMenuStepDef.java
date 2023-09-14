package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardMenuStepDef {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println(expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList= BrowserUtils.getElementsText(dashboardPage.menulist);
        Assert.assertEquals(expectedList,actualList);
        System.out.println("actualList = " + actualList);
    }

}


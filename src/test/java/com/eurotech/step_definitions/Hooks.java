package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setup() {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        System.out.println("This is coming from Before");
    }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb() {
        System.out.println("this ic coming from Before and connecting DB");
    }

    @After("@db")
    public void closeDb() {
        System.out.println("this ic coming from After and closing DB");

    }


}

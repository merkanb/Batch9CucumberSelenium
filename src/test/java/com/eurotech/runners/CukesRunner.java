package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},     // create a rerun file, define failed TC  SUPER
        features = "src/test/resources/Features",
        glue = "com/eurotech/step_definitions",
//       dryRun = true,
        dryRun = false,
//        tags = "@smoke"
//        tags = "@Login"
//        tags = "@smoke and @Student"
//        tags = "@smoke or @Student"
//        tags = "@smoke and not @wip"
//        tags = "@smoke and not @wip and not @Student"
//        tags = "@navigateMenu"
//        tags = "@Navigate2"
//        tags = "@login"
//        tags = "@wip"
//        tags = "@new"
        tags = "@negative"

)



public class CukesRunner {


}

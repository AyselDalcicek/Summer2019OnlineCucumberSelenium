package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",  // path to features
        glue = "com/vytrack/step_definitions",  // path to definitions
        dryRun = false,
       // tags = "",
        tags = "@store_manager",
        // tags = "@negative_test"  // Only those test are executed which has @negative_test annotation
        // tags = "~@negative_test"   // OR   "not @negative_test"    All tests will execute except those test  which has @negative_test annotation
        // tags = "~@negative_test @driver"   // all tests will execute
        plugin = {"html:target/default-cucumber-reports"}


)
public class CucumberRunner {


}

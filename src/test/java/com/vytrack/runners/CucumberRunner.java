package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags ="@smoke_test",
        plugin = {"html:target/default-cucumber-reports",
                 "json:target/cucumber.json"}
)
//        //tags = "@store_manager",
//        // tags = "@negative_test",  // Only those test are executed which has @negative_test annotation
//        // tags = "~@negative_test" ,  // OR   "not @negative_test"    All tests will execute except those test  which has @negative_test annotation
//        // tags = "~@negative_test and @driver"  , // all tests will execute
//        // tags = "@negative_test or @driver" ,  // it has to match at list 2 tasks. Only both of them execute.


//)

public class CucumberRunner {


}

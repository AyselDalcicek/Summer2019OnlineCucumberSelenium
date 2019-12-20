package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/activities",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags ="@driver_with_data_table",
        plugin = {"html:target/default-cucumber-reports",
                 "json:target/cucumber.json"}
)
//        // tags = "@negative_test",  // Only those test are executed which has @negative_test annotation
//        // tags = "~@negative_test" ,  // OR   "not @negative_test"    All tests will execute except those test  which has @negative_test annotation
//        // tags = "~@negative_test and @driver"  , // all @negative_test and @driver will execute ???
//        // tags = "@negative_test or @driver" ,  // it has to match at list 2 tasks. Only both of them execute.

// features ={                             ---> instead of tags we can change features list in run class
//        "src/test/resources/features/activities"
//        "src/test/resources/features/fleet"
//        },
//          OR
// features = "src/test/resources/features/activities/CalendarEvents.feature",
//          OR
// features = "src/test/resources/features/activities",





public class CucumberRunner {


}

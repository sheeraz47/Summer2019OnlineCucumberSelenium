package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // path to features
        glue = "com/vytrack/step_definitions", //path to step definitions
        dryRun = false,
        tags = "@smoke_test",
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/cucumber.json"
        }

)
public class CucumberRunner {


}

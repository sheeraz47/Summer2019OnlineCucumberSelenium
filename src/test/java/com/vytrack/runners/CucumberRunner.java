package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // path to features
        glue = "com/vytrack/step_definitions", //path to step definitions
        dryRun = false,
        tags = "@store_manager",
        plugin = {"html:target/default-cucumber-reports"}

)
public class CucumberRunner {


}

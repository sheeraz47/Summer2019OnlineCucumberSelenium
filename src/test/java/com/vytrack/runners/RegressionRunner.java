package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/activities",
                "src/test/resources/features/fleet",
                "src/test/resources/features/login"
        },
        glue = "com/vytrack/step_definitions",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class RegressionRunner {

}

package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void setup(){
        System.out.println("===============================");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();

    }
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test failed");
        }else {
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
            //System.out.println(scenario.getStatus());
        }
        System.out.println("===============================");
        //After every test, we wanna close browser
        Driver.close();
    }
}

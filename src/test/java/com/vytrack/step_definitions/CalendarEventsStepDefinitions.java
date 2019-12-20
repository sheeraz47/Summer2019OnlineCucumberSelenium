package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import io.cucumber.java.en.*;

import java.util.List;

public class CalendarEventsStepDefinitions {

//    And user verifies that column names are displayed
//            |TITLE            |
//            |CALENDAR         |
//            |START            |
//            |END              |
//            |RECURRENT        |
//            |RECURRENCE       |
//            |INVITATION STATUS|

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
    }

}

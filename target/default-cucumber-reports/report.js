$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fleet/CreateCar.feature");
formatter.feature({
  "name": "Create new car",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@create_car"
    }
  ]
});
formatter.scenario({
  "name": "Create new car",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@create_car"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Fleet\" then to \"Vehicles\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinition.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Create Car\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCarStepDefinitions.user_click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds new car information:",
  "rows": [
    {
      "cells": [
        "License Plate",
        "Driver",
        "Location",
        "Model Year",
        "Color"
      ]
    },
    {
      "cells": [
        "TestPlates",
        "Test Driver",
        "Washington D.C.",
        "2020",
        "Black"
      ]
    },
    {
      "cells": [
        "SuperMan",
        "Cool Driver",
        "Texas D.C.",
        "2019",
        "Red"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCarStepDefinitions.user_adds_new_car_information(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
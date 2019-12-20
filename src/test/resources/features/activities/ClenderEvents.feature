@calender_events
Feature: All calendar events

  Scenario: Verify column names
    Given user is on the login page
    Then  user logs in as store manager
    Then user navigates to "Activities" then to "Calendar Events"
    And user verifies that column names are displayed
      |TITLE            |
      |CALENDAR         |
      |START            |
      |END              |
      |RECURRENT        |
      |RECURRENCE       |
      |INVITATION STATUS|


#  Warm-UP Task:
#  Write two methods, that will return:
#  1. list of options from "view per page" dropdown as list of strings.
#  2. list of column names  as list of strings.
#     You can use qa1.vytrack.com environment and Calendar Events page.
#     user: storemanager85
#  public List<String> getViewPerPageOptions(){
#  }
#  public List<String> getColumnNames(){
#  }
#      Use Summer2019OnlineCucumberSelenium  or any other main project that you use for class
#
#      Put these methods under pages --> CalendarEventsPage class
  ####################################
# Than we created ( getListOfString method in BrowserUtils and
#  getColumnNames() and getViewPerPageOptions() methods in CalendarEventsPage

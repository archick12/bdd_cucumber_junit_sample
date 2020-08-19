Feature: To search testng in google

  @Regression
  Scenario: Login to Hillel Jira
    Given I navigate to Jira Login Page
    And I enter user name - "webinar5"
    And I enter password - "webinar5"
    And I click on the login button
    Then I am on the Home Page

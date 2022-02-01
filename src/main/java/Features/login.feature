Feature: Free CRM Login feature
  Scenario: Test Free CRM login
    Given user is already on login page
    When title of login page is Free CRM
    And user enters username and pwd
    And user clicks on login button
    Then user logs in successfully
    And user is on home page
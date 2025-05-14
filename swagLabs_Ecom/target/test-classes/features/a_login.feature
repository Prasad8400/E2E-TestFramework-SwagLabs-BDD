Feature: Login functionality

  Scenario: Attempt login with incorrect then correct credentials
    Given I am on the login page
    Then I should see the site header
    When I login with invalid password
    Then I should see the error message
    When I login with valid credentials
    Then I should be logged in successfully
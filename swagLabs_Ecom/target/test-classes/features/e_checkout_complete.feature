Feature: Checkout Complete

  Scenario: Verify complete page
    Then I should see order completion page
    And I should see a thank you message
    And I go back to home page
    Then I should see the backpack on home

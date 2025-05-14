Feature: Checkout Overview

  Scenario: Validate checkout overview details
    Then I should see the checkout overview page
    And I should see correct item name, description and price
    When I click finish
